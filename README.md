# Car Service Station - Spring Boot MVC Project

## Overview

This is a simple Spring Boot MVC web application for a car service station. It allows users to register their cars for service by filling out a form. The application demonstrates the use of the MVC pattern, form handling, validation, and data persistence using a service and repository layer. JSP is used for the view layer.

---

## Features

- Register a car for service with details:
  - Registration Number
  - Car Name
  - Covered In Warranty (Yes/No)
  - Remarks
- Form validation for required fields
- Success page on successful registration
- Data persistence using a simple repository pattern

---

## Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com.example.CarService/
     │         ├── Controller/
     │         │    └── RegisterController.java
     │         ├── domain/
     │         │    └── Car.java, Vehicle.java
     │         ├── repository/
     │         │    └── CarDAO.java, DAO.java
     │         └── service/
     │              └── CarRegistrationService.java, Registration.java
     └── webapp/
          └── WEB-INF/
               └── jsp/
                    ├── carregister.jsp
                    └── success.jsp
```

---

## How It Works

1. **Welcome Page:**  
   The user is greeted and can navigate to the car registration form.

2. **Car Registration:**  
   The user fills out the form with car details. The form is validated for required fields.

3. **Submission:**  
   On submission, the controller checks the input. If valid, the car is registered and a success page is shown. If not, the form is displayed again.

4. **Persistence:**  
   Car details are saved using a repository layer.

---

## How to Run

1. **Clone the repository**
2. **Build the project**  
   Use Maven:
   ```
   mvn clean install
   ```
3. **Run the application**
   ```
   mvn spring-boot:run
   ```
4. **Access the app**  
   Open your browser and go to:  
   [http://localhost:8080/welcome](http://localhost:8080/welcome)

---

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Maven

---

## Screenshots

- **carregister.jsp:**  
  Form for car registration

- **success.jsp:**  
  Confirmation page after successful registration

---

## Author

- Tanmay Barman