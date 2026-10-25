
# syntax=docker/dockerfile:1

# --------------------------------------------------
# 1. Build
# --------------------------------------------------
FROM maven:3.9-eclipse-temurin-25-alpine AS build

WORKDIR /workspace

# Aproveita o cache de dependências entre builds
COPY pom.xml ./
RUN mvn -B -ntp dependency:go-offline

COPY src/ ./src/

# Executa testes e empacota a aplicação
RUN mvn -B -ntp verify \
    && test -f target/*.jar

# --------------------------------------------------
# 2. Extração das camadas do Spring Boot
# --------------------------------------------------
FROM eclipse-temurin:25-jdk-alpine AS extract

WORKDIR /workspace

COPY --from=build /workspace/target/*.jar application.jar

RUN java -Djarmode=tools -jar application.jar \
    extract --layers --launcher --destination extracted

# --------------------------------------------------
# 3. Runtime
# --------------------------------------------------
FROM eclipse-temurin:25-jre-alpine AS runtime

ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=75.0 -XX:+ExitOnOutOfMemoryError"

WORKDIR /application

# Usuário e grupo sem privilégios de root
RUN addgroup -S -g 10001 spring \
    && adduser -S -D -H -u 10001 -G spring spring

# Copia somente os artefatos necessários
COPY --from=extract --chown=10001:10001 \
    /workspace/extracted/dependencies/ ./

COPY --from=extract --chown=10001:10001 \
    /workspace/extracted/spring-boot-loader/ ./

COPY --from=extract --chown=10001:10001 \
    /workspace/extracted/snapshot-dependencies/ ./

COPY --from=extract --chown=10001:10001 \
    /workspace/extracted/application/ ./

# Executa a aplicação sem privilégios
USER 10001:10001

EXPOSE 8080

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]