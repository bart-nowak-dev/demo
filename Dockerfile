# Stage 1: Build
FROM gradle:9.3.1-jdk25-alpine@sha256:c60c0cfda2348ff28c0d561428a5aab20c23211e165ab3350a95b33cb15ab495 AS build
WORKDIR /app
COPY build.gradle.kts settings.gradle.kts /app/
RUN gradle dependencies

COPY src /app/src
RUN gradle bootjar

# Stage 2: Runtime
FROM eclipse-temurin:25-jre-alpine AS production

WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]