# Contact Book Application

This project is an example of a Hexagonal Architecture package structure using Java 21 in a contact book application.

## Table of Contents

- [Introduction](#introduction)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Building and Running](#building-and-running)
- [API Endpoints](#api-endpoints)
- [Available cURL Commands](#available-curl-commands)
- [Contributing](#contributing)
- [Creator](#creator)
- [License](#license)

## Introduction

The Contact Book Application is designed to demonstrate the principles of Hexagonal Architecture (also known as Ports and Adapters Architecture) using Java 21. The application allows users to register and retrieve contacts.

## Technologies

- **Java 21**: The latest long-term support (LTS) version of Java.
- **Maven**: A build automation tool used primarily for Java projects.
- **Spring Boot**: A framework that simplifies the development of Java applications.

## Getting Started

### Prerequisites

- **Java 21**: Make sure you have JDK 21 installed. You can download it from the [official website](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
- **Maven**: Ensure you have Maven installed. You can download it from the [official website](https://maven.apache.org/download.cgi).

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/contact-book.git
    cd contact-book
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

## Building and Running

### Running the Application

You can run the application using the Maven Spring Boot plugin:

```sh
mvn spring-boot:run
```

### The application will start and be accessible at http://localhost:8080.
#### API Endpoints
### Register a Contact
```
URL: /api/contacts/register
Method: POST
Request Body:
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890"
}
Response: 200 OK
```
### Retrieve Contacts
```
URL: /api/contacts
Method: GET
Response:
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "1234567890"
  }
]
```

### Available cURL Commands
### Register a Contact
```
curl -X POST http://localhost:8080/api/contacts/register \
-H "Content-Type: application/json" \
-d '{
"name": "João Paulo",
"email": "joao.paulo@email.com",
"phoneNumber": "1234567890"
}'
```
### Retrieve Contacts
```
curl -X GET http://localhost:8080/api/contacts
```

### Creator
#### Name: João Paulo R. Araújo
#### GitHub: github.com/krieegor
#### LinkedIn: www.linkedin.com/in/jprodriguesdev

### License
#### Free to use.