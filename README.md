# Visoul-Backend
The Visoul Backend is a RESTful API built with Spring Boot that powers the Visouls Coming Soon Website. It handles email subscriptions from users and securely stores them in a MySQL database hosted on Railway.
# 🚀 Spring Boot Backend API

## 📘 Overview
This is a RESTful backend service built with **Spring Boot** and **MySQL**.  
It provides secure APIs for managing data, authentication, and business logic for the project.

---

## 🧱 Tech Stack
------------------------------------
| Layer          | Technology      |
|----------------|-----------------|
| Language       | Java 21         |
| Framework      | Spring Boot     |
| Build Tool     | Maven           |
| Database       | MySQL           |
| ORM            | Spring Data JPA |
| Testing        | Postman         |  
------------------------------------

---

## 📂 Project Structure

<pre>
src/
 ├── main/
 │   ├── java/com/example/project/
 │   │   ├── controller/
 │   │   ├── model/
 │   │   ├── repository/
 │   │   ├── service/
 │   │   └── config/
 │   └── resources/
 │       ├── application.properties
 │       └── static/
 └── test/
     └── java/com/example/project/
</pre>

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository
```
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```
### 2️⃣ Configure the Database

Make sure MySQL is running locally or remotely, and create a database:
```
CREATE DATABASE your_database_name;
```
### 3️⃣ Configure Environment

There are two ways to configure your database credentials:

### Option A — .env File (Optional if using Spring Boot 3.2+)

Create a file named .env in the project root:
```
DB_HOST=localhost
DB_PORT=3306
DB_NAME=your_database_name
DB_USER=root
DB_PASSWORD=your_password
```
### Option B — Modify application.properties

Open the file:
src/main/resources/application.properties
```
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password

# Hibernate Settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
### 4️⃣ Build and Run the Project
```
mvn spring-boot:run
```
### 5️⃣ Testing the API in Postman
🔹 Example: Send JSON Data with POST Request

Method: POST
URL: http://localhost:8080/
```
{
  "email": "john@example.com"
}
```
reveice a succussfull message!!!

### 6️⃣ Docker Setup (Optional if ur depolying in Render)
```version: "3.8"
services:
  mysql:
    image: mysql:8
    container_name: mysql_container
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: your_database_name
    ports:
      - "3306:3306"
    networks:
      - springboot-net

  app:
    build: .
    container_name: springboot_app
    ports:
      - "8080:8080"
    depends_on:
      - mysql
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/your_database_name
      SPRING_DATASOURCE_USERNAME: root
      SPRING_DATASOURCE_PASSWORD: root
    networks:
      - springboot-net

networks:
  springboot-net:
    driver: bridge
```
----
## Contact

**Jagadeesh S**  
📧 sjagadeesh668@gmail.com  
