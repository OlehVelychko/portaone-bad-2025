# Use a lightweight OpenJDK 17 image
FROM openjdk:17-jdk-slim
LABEL authors="olehvelychkodev"

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/portaone-bad-2025.jar app.jar

# Ensure the container can process different input files by using a flexible command
CMD ["java", "-jar", "app.jar", "PortaOne.txt"]