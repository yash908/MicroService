# User Service - Spring Boot Microservice

This is a **User Management Microservice** developed using Spring Boot as part of a microservices architecture. It handles user-related operations such as registration, login, role management, and JWT-based authentication.

---

## 🧩 Features

- User registration and login with secure password encryption
- JWT token-based authentication and authorization
- Role-based access control (Admin, Moderator, User)
- Modular project structure following clean architecture
- Exception handling and logging with centralized responses
- Database integration using JPA and MySQL
- RESTful API design for external service consumption

---

## 🏗️ Tech Stack

- **Java 17+**
- **Spring Boot 3**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**
- **Postman** (for API testing)

---

## 📁 Project Structure
user-service/
├── src/
│ ├── main/
│ │ ├── java/com/micro/user_service/
│ │ │ ├── config/ # Security, JWT, and CORS config
│ │ │ ├── controller/ # REST APIs
│ │ │ ├── model/ # Entity classes
│ │ │ ├── repository/ # JPA repositories
│ │ │ ├── security/ # JWT filters and helpers
│ │ │ └── service/ # Business logic
│ │ └── resources/
│ │ ├── application.yml # App config
│ │ ├── static/ # Static files
│ │ └── templates/ # Thymeleaf (if used)
└───target/ # Compiled classes (auto-generated)


