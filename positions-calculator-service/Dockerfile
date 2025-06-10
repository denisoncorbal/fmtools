FROM eclipse-temurin:24-jdk-alpine-3.21 AS build
COPY /src /src 
COPY pom.xml pom.xml
COPY /.mvn /.mvn
COPY --chown=+x mvnw mvnw
RUN --mount=type=cache,target=/root/.m2 ./mvnw clean spotless:apply package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM eclipse-temurin:24-jre-alpine-3.21
RUN apk add curl
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","br.com.dgc.fmtools.positions_calculator_service.PositionsCalculatorServiceApplication"]