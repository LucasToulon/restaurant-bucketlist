# Restaurant Bucket List
## Overview
This project is a restaurant bucket list system developed using Spring Boot. It provides a REST API for managing restaurant data and a web interface for interacting with the system. The application allows users to create, read, update, and delete restaurant information stored in a PostgreSQL database.

## Features
CRUD Operations: Create, read, update, and delete restaurants.
REST API: A RESTful service for managing restaurant data.
Web Interface: A Thymeleaf-based frontend for easy interaction with the system.
Technologies Used
Spring Boot
PostgreSQL
Gradle
JavaScript, HTML, CSS

## Getting Started
### Prerequisites
JDK 1.8 or later
Gradle
PostgreSQL
Setting Up the Project
### Clone the repository:
`git clone https://github.com/LucasToulon/restaurant-bucketlist.git`

### Navigate to the project directory:
`cd restaurant-bucketlist`

### Configure PostgreSQL:
Create a database named postgre.
Update the application.properties with your PostgreSQL username and password.

## Run the Application:

### Using Gradle:
`./gradlew bootRun`

### Access the application:

Open a web browser and go to http://localhost:8080/index.html

### Usage
- Add a Restaurant: Navigate to the /create endpoint and fill in the restaurant details.
- View Restaurants: The main page lists all restaurants.
- Edit a Restaurant: Click 'Edit' next to a restaurant on the main page.
- Delete a Restaurant: Click 'Delete' next to a restaurant on the main page.


## Contributing
Contributions to this project are welcome. Please follow these steps:

1. Fork the repository.
2. Create a new branch (git checkout -b feature-branch).
3. Make your changes.
4. Commit your changes (git commit -am 'Add some feature').
5. Push to the branch (git push origin feature-branch).
6. Open a new Pull Request.

## License
No license
