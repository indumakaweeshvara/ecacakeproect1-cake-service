# EcaCakeProject1 Cake Service

Microservice responsible for cake-related functionality.

## Student Information
- **Student Name**: Induma Kaweeshvara
- **Student Number**: 241722023

## Repository Description
The Cake Service manages cake inventory, categories, pricing, and descriptions. It exposes CRUD REST APIs for frontend integration.

## Technology Stack
- **Framework**: Spring Boot
- **Persistence**: Spring Data JPA, MySQL
- **Build Tool**: Maven

## Setup / Getting Started Instructions
1. Configure environment variables for your MySQL database connection:
   ```bash
   export SPRING_DATASOURCE_USERNAME=your_username
   export SPRING_DATASOURCE_PASSWORD=your_password
   ```
2. Ensure the Service Registry is running on port `9001` and Config Server on `9000`.
3. Build the microservice using Maven:
   ```bash
   mvn clean package -DskipTests
   ```
4. Run the application:
   ```bash
   java -jar target/cake-service-1.0.0.jar
   ```
   The service will start on port `8001`.
