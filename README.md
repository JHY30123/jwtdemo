# jwt-demo

A **Spring Boot** project demonstrating **JWT authentication** with a **MySQL** database.

---

## 🚀 Features

- JWT-based authentication and authorization
- MySQL database integration
- RESTful API endpoints

---

## ✅ Prerequisites

- **Java 17** or higher
- **Maven**
- **MySQL** (installed locally or via Docker)

---

## ⚙️ Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/JHY30123/jwtdemo.git
   cd jwtdemo
   ```

2. **Configure the database**

   Update your database settings in [`src/main/resources/application.properties`](src/main/resources/application.properties) if needed.

---

## 🏗️ Build & Run

**Build the project:**

```bash
mvn clean package
```

**Run the application:**

```bash
java -jar target/*.jar
```

By default, the server runs at [http://localhost:8081](http://localhost:8081).

---

## 🐳 Docker

To run the application and MySQL using Docker:

1. **Build and start containers**

   ```bash
   docker-compose up --build
   ```

2. The application will be available at [http://localhost:8081](http://localhost:8081).

---

## 📌 API Endpoints

- `/auth/**` — Authentication endpoints (e.g., login, register)
- `/users/**` — User management endpoints

---

## 📄 License

This project is licensed under the **MIT License**.
