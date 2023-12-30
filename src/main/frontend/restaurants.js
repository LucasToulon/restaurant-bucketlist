// script.js

const apiUrl = 'http://localhost:8080/restaurants';

// Function to get all restaurants
function getAllRestaurants() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            console.log(data);
            // Update your DOM here with the fetched data
        })
        .catch(error => console.error('Error:', error));
}

// Call the function to fetch data
getAllRestaurants();

// Add similar functions for creating, updating, and deleting restaurants
