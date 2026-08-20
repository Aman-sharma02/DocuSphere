# ============================
# Stage 1: Build the application
# ============================
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

# Copy Maven wrapper and Maven configuration
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy application source code
COPY src ./src

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests


# ============================
# Stage 2: Run the application
# ============================
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy only the generated JAR from build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
