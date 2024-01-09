#Stage 1: Build JAR file
FROM openjdk:17-jdk-slim as build
WORKDIR /app
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN ./gradlew build -x test

#Stage 2: Copy JAR and start app
FROM openjdk:17-jdk-slim
COPY --from=build /app/build/libs/animal-movement-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
