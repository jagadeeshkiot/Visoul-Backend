# ==========================================
# Stage 1: Build the Spring Boot application
# ==========================================
FROM maven:3.9.5-eclipse-temurin-21 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies first (for caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# ==========================================
# Stage 2: Run the packaged JAR
# ==========================================
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file built in the previous stage
COPY --from=build /app/target/Visoul-Website-0.0.1-SNAPSHOT.jar .

# Expose the port your app listens on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "Visoul-Website-0.0.1-SNAPSHOT.jar"]
