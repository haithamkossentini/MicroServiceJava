

# Use official OpenJDK image as runtime stage
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the executable JAR file from the build stage to the runtime stage
COPY target/ServiceArticle-0.0.1-SNAPSHOT.jar .

# Expose the port that the application listens on
EXPOSE 8002

# Set the command to run the application
CMD ["java", "-jar", "ServiceArticle-0.0.1-SNAPSHOT.jar"]
