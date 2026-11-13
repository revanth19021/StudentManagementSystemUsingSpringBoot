# Student Management System

## Project Overview

The **Student Management System** is a web-based application developed using Spring Boot, Java, JDBC, MySQL, and Thymeleaf. It is designed to manage student information efficiently by providing functionalities to register, update, delete, and retrieve student records.

The application follows a layered architecture consisting of Model, Repository, Service, and Controller layers to maintain clean code organization and separation of responsibilities.

## Technologies Used

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **Frontend:** HTML, CSS, Thymeleaf
- **Server:** Embedded Apache Tomcat
- **IDE:** Eclipse / Spring Tool Suite
- **Build Tool:** Maven

## Project Features

1. **Home Page** – Provides navigation to different sections of the application.
2. **About Page** – Displays information about the college.
3. **Student Registration** – Allows users to register new student details.
4. **Update Student** – Allows users to modify existing student information.
5. **Delete Student** – Allows users to delete student records using their student ID.
6. **Retrieve All Students** – Displays all registered student records.
7. **Retrieve Student by ID** – Fetches an individual student's details using their student ID.
8. **Contact Page** – Displays contact information.

## Student Details

The application manages the following student information:

- Student ID
- Student Name
- Branch
- Email
- Mobile Number
- Address
- Date of Birth

## Project Architecture

The application follows a four-layer architecture.

```text
StudentManagementSystem
│
├── src/main/java
│   │
│   └── cse_5.StudentManagementSystem
│       │
│       ├── model
│       │   └── StudentManagementSystemModel.java
│       │
│       ├── repository
│       │   └── StudentManagementSystemRepository.java
│       │
│       ├── service
│       │   └── StudentManagementSystemService.java
│       │
│       ├── controller
│       │   └── StudentManagementSystemController.java
│       │
│       └── StudentManagementSystemApplication.java
│
├── src/main/resources
│   │
│   ├── templates
│   │   ├── home.html
│   │   ├── about.html
│   │   ├── register.html
│   │   ├── update.html
│   │   ├── delete.html
│   │   └── contact.html
│   │
│   └── application.properties
│
└── pom.xml
```

### Layer Responsibilities

**1. Model Layer**
- Contains the StudentManagementSystemModel class.
- Defines student properties, constructors, getters, and setters.
- Represents student data.

**2. Repository Layer**
- Handles database connectivity using JDBC.
- Executes SQL queries using PreparedStatement.
- Performs database CRUD operations.

**3. Service Layer**
- Connects the Controller and Repository layers.
- Calls repository methods to perform student management operations.

**4. Controller Layer**
- Handles HTTP requests using Spring MVC annotations.
- Maps URLs to application methods.
- Connects HTML pages with the Service layer.

## Database Configuration

### Database Name

```sql
CREATE DATABASE student_management;

USE student_management;
```

### Table Creation

```sql
CREATE TABLE student_details (
    studentid INT PRIMARY KEY,
    studentname VARCHAR(100) NOT NULL,
    branch VARCHAR(50),
    email VARCHAR(100),
    mobileno VARCHAR(15),
    address VARCHAR(255),
    dateofbirth DATE
);
```

### Sample Records

```sql
INSERT INTO student_details
(studentid, studentname, branch, email, mobileno, address, dateofbirth)
VALUES
(101, 'Ravi Kumar', 'CSE', 'ravi@gmail.com',
 '9876543210', 'Guntur', '2003-05-15');
```

## Application Configuration

Configure your MySQL database credentials in `src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=your_password

server.port=4001
```

Replace `your_password` with your actual MySQL password.

## Application Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Home page |
| GET | `/about` | About page |
| GET | `/register` | Registration page |
| POST | `/register` | Register a student |
| GET | `/update` | Update page |
| POST | `/update` | Update student details |
| GET | `/delete` | Delete page |
| POST | `/delete` | Delete a student |
| GET | `/contact` | Contact page |
| GET | `/getStudents` | Retrieve all students |
| GET | `/getStudent?studentid=101` | Retrieve student by ID |

## How to Run the Project

1. Clone or download the project.
2. Open the project in Eclipse or Spring Tool Suite.
3. Configure MySQL database credentials in `application.properties`.
4. Execute the database and table creation queries.
5. Update Maven dependencies if required.
6. Run `StudentManagementSystemApplication.java` as a Spring Boot application.
7. Open your browser and navigate to:

```text
http://localhost:4001/
```

## Future Enhancements

- Add student search functionality.
- Add form validation.
- Improve UI using Bootstrap.
- Implement Spring Security for authentication and authorization.
- Add pagination for student records.
- Display success and error messages.

## Author

**Student Management System**

Developed using Java, Spring Boot, JDBC, MySQL, and Thymeleaf.

