# Use official OpenJDK image as runtime stage
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the executable JAR file from the build stage to the runtime stage
COPY target/ServiceProvider-0.0.1-SNAPSHOT.jar .

# Expose the port that the application listens on
EXPOSE 8005

# Set the command to run the application
CMD ["java", "-jar", "ServiceProvider-0.0.1-SNAPSHOT.jar"]