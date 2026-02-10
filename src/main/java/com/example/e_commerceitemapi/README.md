# E-Commerce Item API (Spring Boot)

This is a simple Java Spring Boot backend application that provides RESTful APIs
to manage items similar to a basic e-commerce system.

## Features
- Add a new item
- Get an item by ID
- In-memory data storage using ArrayList
- Basic input validation

## Technologies Used
- Java 17
- Spring Boot
- Maven
- Postman (for API testing)

## How to Run the Application
1. Import the project into Eclipse IDE
2. Run the main class:
   `ECommerceitemapiApplication.java`
3. The application will start on port **8080**

## API Endpoints

### Add Item
- **URL:** `/items`
- **Method:** POST
- **Request Body (JSON):**
```json
{
  "name": "Mobile",
  "description": "Samsung phone",
  "price": 15000
}
