# Todo Application API

This is a Java-based Todo application API built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL. The API allows users to perform various operations on Todo items.

## Features

- Create a new Todo item
- Delete a Todo item by ID
- Update a Todo item
- Retrieve a list of all Todo items
- Search for Todo items by various criteria (ID, title, status, content, added date, last date)

## Technology Stack

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Maven

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository: `git clone https://github.com/YASHWANT456/todo-application.git`
2. Import the project into your preferred IDE (e.g., Spring Tool Suite).
3. Configure your MySQL database settings in the `application.properties` file.
4. Build and run the project.

## API Endpoints

- `POST /api/todos`: Create a new Todo item.
- `DELETE /api/todos/{id}`: Delete a Todo item by ID.
- `PUT /api/todos/{id}`: Update a Todo item by ID.
- `GET /api/todos`: Retrieve a list of all Todo items.
- `GET /api/todos/{id}`: Retrieve a Todo item by ID.
- `GET /api/todos/search`: Search for Todo items using query parameters (e.g., title, status, content, added date, last date).

## Customized Exception Handling

This project includes custom exception handling to handle errors gracefully. Global exception handling ensures that error responses are consistent and informative.

## Custom Query for Search API

The API provides a custom query for searching Todo items based on various criteria. This allows users to filter and retrieve specific Todo items that match their search criteria.



## Contributors

- [github.com/YASHWANT456](https://github.com/YASHWANT456) - Creator



