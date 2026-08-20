# Use a lightweight JDK base image
FROM eclipse-temurin:17-jre

# Set the working directory
WORKDIR /app

# Copy the jar file (update with your actual jar name if needed)
COPY target/docusphere-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
