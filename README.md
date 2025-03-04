Expense-tracker–backend



💻 Backend for the Expense Tracker Full-Stack ProjectThis is the RESTful API for the Expense Tracker, built with Spring Boot and PostgreSQL.Designed for expense tracking, receipt scanning, and financial management, this API supports full CRUD operations and integrates testing for reliability.



Tech Stack:

Java 17

Spring Boot 3

Spring Data JPA

Spring Validation

H2 Database (for testing)

PostgreSQL (for production)

Swagger UI (API Docs & Testing)

JUnit 5 & Mockito (Unit & Integration Tests)


Features:

Full CRUD Operations: Add, edit, delete & retrieve expenses
 
Database Persistence: H2 (dev/testing) → PostgreSQL (production)

Swagger UI: Auto-generated API documentation

Unit & Integration Testing: Controller & Service Layer Tested

Exception Handling: Global error handling for stability



API Endpoints:

GET /api/expenses Fetch all expenses

GET /api/expenses/{id} Get an expense by ID

POST /api/expenses Add a new expense

PUT /api/expenses/{id} Update an existing expense

DELETE /api/expenses/{id} Remove an expense



Testing Coverage:

This backend is fully tested, using JUnit 5 & Mockito:

Service Layer Testing (Mocks Repository)

Controller Testing (MockMVC)

Integration Testing (API Behavior Validation)



Setup Database:

Default: H2 (in-memory, no setup needed)

Switch to PostgreSQL in application.properties

Run Spring Boot App

./gradlew bootRun

Test API Endpoints

Swagger UI: http://localhost:8080/swagger-ui.html




🏆 Contribute, this project is open-source! PRs, issues, and discussions are welcome.



🌟 Star this repo to support the project & stay updated!



👯 Contact & Feedback: elisemarieveskioja@gmail.com
