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

- `POST /todo/addTodo`: Create a new Todo item.
- `DELETE /todo/deleteTodo/{id}`: Delete a Todo item by ID.
- `PUT /todo/updateTodo/{id}`: Update a Todo item by ID.
- `GET /todo/getAllTodo`: Retrieve a list of all Todo items.
- `GET /todo/getTodo/{id}`: Retrieve a Todo item by ID.
- `GET /todo/getTodoBysearch/{search}`: Search for Todo items using query parameters (e.g., title, status, content, added date, last date).

## Customized Exception Handling

This project includes custom exception handling to handle errors gracefully. Global exception handling ensures that error responses are consistent and informative.

## Custom Query for Search API

The API provides a custom query for searching Todo items based on various criteria. This allows users to filter and retrieve specific Todo items that match their search criteria.

## Screenshots

Add Todo
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/27eb3b3e-1e09-4a54-a532-72cb6084513f)

Get All Todo
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/107a43a6-d8a7-4708-8a93-6200bfdcd370)

Get Todo by Id
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/2a7a05f4-e09c-4ab3-ba4e-b6fbfa891218)

Get Todo by Specific Criteria
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/83e8e1d4-9cfe-4ca8-839b-692229af5e1e)

Update Todo
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/8623a2fe-21ec-46bf-85a1-e57dffe4603b)

Delete Todo
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/64a2b3ee-9f04-428c-8338-a6c89f4eb80a)

Custom Exception
![image](https://github.com/YASHWANT456/Todo-Management/assets/71956889/5d386577-e58d-4e18-a6c1-aa41f78e3c67)

## Made By

- [YASHWANT456](https://github.com/YASHWANT456) 



