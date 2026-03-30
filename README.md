# Library Management API

A RESTful Library Management System built with Java Spring Boot.

##  Tech Stack
- Java 17
- Spring Boot
- Hibernate ORM + MySQL
- JUnit & Mockito
- JWT Authentication
- Swagger UI

## Getting Started
1. Clone the repo
2. Create MySQL database: `CREATE DATABASE library_db;`
3. Copy `application.properties.example` → `application.properties`
4. Add your MySQL password
5. Run `LibrarymanagementApplication.java`

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/books | Get all books |
| GET | /api/books/{id} | Get book by ID |
| POST | /api/books | Add new book |
| PUT | /api/books/{id} | Update book |
| DELETE | /api/books/{id} | Delete book |

## Status
🚧 In Progresstest
