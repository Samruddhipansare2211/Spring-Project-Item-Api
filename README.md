# 📦 Item Management REST API

A RESTful API built using **Spring Boot 3** and **Java 21** to manage a collection of items.  
This project demonstrates backend development, validation, Docker containerization, and cloud deployment.

---

## 📌 Overview

This application allows users to:

- Add new items
- Retrieve items by ID
- Validate input data
- Run the application locally or via Docker
- Deploy on cloud platforms like Render

The data is stored in-memory using an ArrayList.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot 3.2.5
- Maven
- Docker
- Render (Cloud Deployment)
- UptimeRobot (Monitoring)

---

## 📂 Project Structure

```

Spring-Project-Item-Api
│
├── src/main/java/com/example/itemapi
│   ├── controller
│   │   └── ItemController.java
│   ├── service
│   │   └── ItemService.java
│   ├── model
│   │   └── Item.java
│   └── ItemApiSpringProjectApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── Dockerfile
├── pom.xml
└── README.md

````

---

## 🔗 API Endpoints

### 1️⃣ Add New Item

**POST** `/api/items`

### Request Body:
```json
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
````

### Response:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
```

---

### 2️⃣ Get Item By ID

**GET** `/api/items/{id}`

Example:

```
GET /api/items/1
```

---

## ✅ Validation Rules

* Name must not be empty
* Description must not be empty
* Price must be greater than 0

If validation fails, the API returns:

```
400 Bad Request
```

---

## 🧪 How to Run Locally

### Step 1: Clone Repository

```bash
git clone https://github.com/your-username/Spring-Project-Item-Api.git
cd Spring-Project-Item-Api
```

### Step 2: Build Project

```bash
mvn clean install
```

### Step 3: Run Application

```bash
mvn spring-boot:run
```

Application will run at:

```
http://localhost:8081
```

---

## 🐳 Docker Setup

### Build Docker Image

```bash
docker build -t item-api .
```

### Run Container

```bash
docker run -p 8080:8080 item-api
```

---

## ☁ Cloud Deployment (Render)

1. Push project to GitHub.
2. Go to Render Dashboard.
3. Create New Web Service.
4. Select Docker deployment.
5. Connect GitHub repository.
6. Deploy.

Live URL format:

```
https://spring-project-item-api.onrender.com/api/items/1
```

---

## 📡 Monitoring

UptimeRobot is configured to ping the application endpoint to prevent sleep mode on free hosting.

---

## 🔒 Future Improvements

* Add database (MySQL/PostgreSQL)
* Add Update and Delete APIs
* Add Swagger Documentation
* Add JWT Authentication
* Add CI/CD Pipeline

---

## 👩‍💻 Author

Samruddhi Pansare

## 🔗 Connect with Me

💼 LinkedIn: [https://www.linkedin.com/in/your-linkedin-profile](https://www.linkedin.com/in/samruddhi-pansare-b34371328/)

💻 GitHub: https://github.com/Samruddhipansare2211

🛠 Skills

Java | Spring Boot | AWS | DevOps | Docker | Git | REST API Development

---

