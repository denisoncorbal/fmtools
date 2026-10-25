
# syntax=docker/dockerfile:1

# Em produção, fixe esta imagem por digest SHA-256 validado
# e atualize o digest por meio de um processo controlado.
ARG NODE_IMAGE=node:24.22.1-alpine

FROM ${NODE_IMAGE} AS base
WORKDIR /app

# ============================================
# Dependências
# ============================================
FROM base AS deps

# Instale apenas se houver dependências que exijam essa compatibilidade.
# RUN apk add --no-cache libc6-compat

COPY package.json package-lock.json ./

# Para registries privados, forneça o .npmrc via secret do BuildKit.
RUN --mount=type=secret,id=npmrc,target=/root/.npmrc,required=false \
  npm ci --no-audit --no-fund

# ============================================
# Build
# ============================================
FROM base AS builder

ENV NEXT_TELEMETRY_DISABLED=1

COPY --from=deps /app/node_modules ./node_modules
COPY . .

RUN npm run build

# ============================================
# Runtime
# ============================================
FROM base AS runner

ENV NODE_ENV=production \
  NEXT_TELEMETRY_DISABLED=1 \
  PORT=3000 \
  HOSTNAME=0.0.0.0

# Usuário não privilegiado.
RUN addgroup -S -g 1001 nodejs \
  && adduser -S -D -H -u 1001 -G nodejs nextjs

# O diretório public precisa existir no contexto do build.
COPY --from=builder --chown=nextjs:nodejs /app/public ./public

COPY --from=builder --chown=nextjs:nodejs \
  /app/.next/standalone ./

COPY --from=builder --chown=nextjs:nodejs \
  /app/.next/static ./.next/static

USER 1001:1001

EXPOSE 3000

CMD ["node", "server.js"]
