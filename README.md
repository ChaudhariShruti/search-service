# search-service
Java SpringBoot Search Service Assignment
.

📦 Search Service – Spring Boot Assignment
📌 Project Overview
This project is a Spring Boot REST application developed as part of an internship assignment.
The application fetches product data from a MySQL database, filters products priced under $50, sorts them alphabetically, and returns only product names using Java Stream API.
The project demonstrates:


REST API development
Database integration using Spring Data JPA
Java Streams for data processing
Clean layered architecture

🛠️ Tech Stack

Java (17)
Spring Boot
Spring Data JPA
MySQL
Maven
Git & GitHub

🏗️ Project Architecture
Controller → Service → Repository → MySQL Database

Package Structure
com.example.searchservice
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── SearchServiceApplication


📊 Database Details
Database Name
searchdb

Table: products
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL
);

Sample Data
INSERT INTO products (name, price) VALUES
('Pen', 10),
('Book', 60),
('Pencil', 5),
('Notebook', 40),
('Bag', 120);


🔄 Application Flow

Products are fetched from the MySQL products table
Java Streams are used to:
Filter products with price < 50
Extract product names
Sort names alphabetically
Filtered result is returned via REST API

🚀 REST API Endpoint
Get Products Under $50
Request
GET /search

Response
["Notebook", "Pen", "Pencil"]


⚙️ Configuration
application.properties
spring.application.name=searchService
spring.datasource.url=jdbc:mysql://localhost:3306/searchdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect


▶️ How to Run the Project


Clone the repository
git clone https://github.com/your-username/search-service.git

Open the project in IntelliJ IDEA
Ensure MySQL is running
Update database credentials in application.properties
Run SearchServiceApplication


Access the API:
http://localhost:8080/search




🧠 Key Learnings


RESTful API design using Spring Boot
Database access using Spring Data JPA
Java Stream API (filter, map, sorted)
Git version control and GitHub collaboration
Debugging real-world integration issues


👤 Author

Shruti Ravindra Chaudhari
✅ Assignment Requirements Covered
✔ Java & Spring Boot
✔ REST API
✔ Database integration (MySQL)
✔ Java Streams usage
✔ Clean and readable code
✔ GitHub repository submission




