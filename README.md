# School Management API

This is a Spring Boot application for managing students in a school.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Dependencies](#dependencies)

## Features

- Add a new student
- Get details of a student by ID, name, or class
- Update student details

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed
- Apache Maven or Gradle installed (for building the project)
- MySQL database server installed and running

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:  `git clone <repository-url>  `
2. Navigate to the project directory:  `cd school-management-api `
3. Build the project using Maven : ` mvn clean install `

The application will start on http://localhost:8080.

## API Endpoints

The following endpoints are available:

- `POST /students`: Add a new student
- `GET /students/{id}`: Get details of a student by ID
- `GET /students?name={name}`: Get details of a student by name
- `GET /students?class={class}`: Get details of students by class
- `PUT /students/{id}`: Update details of a student by ID

## Dependencies

The project uses the following dependencies:

- Spring Boot: for creating the application
- Spring Data JPA: for data access
- MySQL Connector: for connecting to the MySQL database
- Springfox: for generating API documentation with Swagger


