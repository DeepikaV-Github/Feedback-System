# Feedback-System
## 🚀 How to Run the Project
Make sure you have the following installed:
- Java 17 or higher ✅
- Maven ✅
- PostgreSQL running with a database named `feedbackSystem`

Updated my database credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.username=postgres
spring.datasource.password=12345

Then run the project using Maven: mvn spring-boot:run
Once the app is running, visit:
📍 http://localhost:8080

---

## 🧰 Tech Stack
- ☕ Java 17  
- 🌱 Spring Boot  
- 🗃️ PostgreSQL  
- 🐘 Hibernate / JPA  
- 🔧 Maven  

---

## Sample API Requests
You can test the API using tools like Postman, Insomnia, or cURL.
➕ POST /feedback
curl -X POST http://localhost:8080/feedback \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Deepika",
        "email": "deepika@gmail.com",
        "message": "Good and no damage for the product delivered"
      }'
📄 GET /feedback
curl http://localhost:8080/feedback

---

🧪 How to Run Tests
To run all unit tests:
mvn test
All test classes should be placed under:
src/test/java/com/example/feedback/
JUnit Test classes and folder - WebMockTest, service folder 

---
