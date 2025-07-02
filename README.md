# 🛡️ Spring Boot JWT Authentication API

This is a secure REST API built using **Spring Boot 3.5.0** with **JWT-based Authentication** and tested via **Postman** and **PowerShell**.

---

## 📦 Features

- JWT-based login (`/auth/login`)
- Protected route (`/home/users`)
- Token validation via `Authorization: Bearer <token>` header
- Stateless session management
- Custom authentication filter

---

## 🛠️ Tech Stack

- Java 22
- Spring Boot 3.5.0
- Spring Security
- JPA + Hibernate
- MySQL (or H2 as fallback)
- Postman / PowerShell for testing

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone <your-repo-url>
cd com.mit.project
````

---

### 2. Run the Application

Ensure MySQL is running or switch to H2. Then run:

```bash
mvn spring-boot:run
```

The app will start on:
📍 `http://localhost:8085`

---

### 3. Login Endpoint

**URL:** `POST http://localhost:8085/auth/login`
**Body (JSON):**

```json
{
  "email": "sahas1",
  "password": "yourPassword"
}
```

**Response:**

```json
{
  "jwtToken": "<your-JWT-token>",
  "userName": "sahas1"
}
```

---

### 4. PowerShell Example to Access Secured Endpoint

```powershell
Invoke-RestMethod -Uri "http://localhost:8085/home/users" `
  -Headers @{ Authorization = "Bearer eyJhbGciOi..." } `
  -Method GET
```

**Sample Output:**

```text
id                                   email         password
--                                   -----         --------
5ca3f378-ae6c-4b2f-910c-04ad16fe1d56 abc@gmail.com Pass
59322898-76fb-406c-b15e-288c7665cf47 def@gmail.com Pass
311f90f3-4fd5-4a6f-9d08-3b4354a076e8 ghi@gmail.com Pass
7e77ee50-4017-4cb3-b6fa-1a25b9b0b6af klm@gmail.com Pass
```

---

## 🔐 Secured Endpoints

| Endpoint      | Method | Access     |
| ------------- | ------ | ---------- |
| `/auth/login` | POST   | Public     |
| `/home/users` | GET    | Secured 🔒 |

---

## 📁 Project Structure

```
src
└── main
    ├── java
    │   └── RestApi_Project2.com.mit.project
    │       ├── Controller
    │       ├── Entity
    │       ├── Security
    │       └── Application.java
    └── resources
        └── application.properties
```

---

## ✅ Notes

* Ensure the token is prefixed with `Bearer ` when making authenticated requests.
* The token is valid for a limited time (as configured in `JwtHelper`).

---

## 👨‍💻 Author

Developed by **Sahas Nagar**


