# Car Management System

A Spring Boot application for managing car details with functionalities like CRUD operations, global search, pagination, sorting, input validation, and API documentation.

---

## Features
- Add, update, delete, and retrieve car details.
- Search globally across car attributes.
- Pagination and sorting for efficient data retrieval.
- Validation of input fields to ensure data integrity.


---

## Prerequisites
- Java 17 
- Maven 2.5.6
- MySQL database.
- IDE ( Eclipse or Visual Studio Code).
- A configured and running database instance.

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd car-management-system
```
### Configure Database
Update the database details in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://<DATABASE_HOST>:<PORT>/<DATABASE_NAME>
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
### Run the Application

Run main file 
The application will be available at: http://localhost:8091.


### API Endpoints

Local: http://localhost:8091 

HTTP Method	         Endpoint	                          Description
GET	              /api/car/getAllCar	             Retrieve all cars with pagination and sorting.
POST             	/api/car/addCar                  Add a new car.
PUT	              /api/car//updateCar/{id}       	 Update an existing car by ID.
DELETE	          /api/car/deleteCar/{id}   	     Delete a car by ID.
GET               /api/car/search     	           Search cars globally by any attribute.


### Technologies Used
Backend Framework: Spring Boot
Database: MySQL
Build Tool: Maven


### Author
Shubham Pawar
Backend Developer | Java Fullstack Intern
