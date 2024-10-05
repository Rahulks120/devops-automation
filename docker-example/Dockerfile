# Use the Eclipse Temurin OpenJDK 17 as the base image
FROM eclipse-temurin:17

# Metadata about the image maintainer
LABEL maintainer="ivoyant@gmail.com"

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target folder of the build to the container
COPY target/docker-example-0.0.1-SNAPSHOT.jar /app/spring-boot-docker.jar

# Specify the command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/spring-boot-docker.jar"]

# Expose port 8080 to allow access to the application
EXPOSE 8080
