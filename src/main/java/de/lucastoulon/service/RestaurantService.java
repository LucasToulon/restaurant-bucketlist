package de.lucastoulon.service;

import de.lucastoulon.model.Restaurant;
import de.lucastoulon.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(Long id) {
        return repository.findById(id);
    }

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
        repository.deleteById(id);
    }

    // Additional business logic if needed
}
