BookFlow

A REST API for library management, developed with Java and Spring Boot.

About the Project

BookFlow is a backend project created to practise Java development, object-oriented programming, and REST API design.

The application provides a foundation for managing books through a structured backend architecture.

Technologies

* Java
* Spring Boot
* Spring Data JPA
* Maven
* H2 Database
* REST API
* JSON

Project Structure

The application follows a layered architecture:

* Controller: Handles HTTP requests and API endpoints.
* Service: Contains the business logic.
* Repository: Manages data access.
* Model: Represents the book entity.
* Exception: Handles application errors.

Getting Started

Prerequisites

* Java JDK
* Maven (or the included Maven Wrapper)

Run the Application

Clone the repository:

git clone https://github.com/barbaranicolly/BookFlow.git

Navigate to the project directory:

cd BookFlow

Run the application on Windows:

.\mvnw.cmd spring-boot:run

The API will be available at:

http://localhost:8080

Project Status

In development. New features and improvements will be added as the project evolves.