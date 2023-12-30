package de.lucastoulon.controller;

import de.lucastoulon.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import de.lucastoulon.service.RestaurantService;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/")
    public List<Restaurant> getAllRestaurants() {
        return service.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        return service.getRestaurantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return service.saveRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurantDetails) {
        return service.getRestaurantById(id)
                .map(restaurant -> {
                    restaurant.setName(restaurantDetails.getName());
                    restaurant.setCity(restaurantDetails.getCity());
                    restaurant.setCuisine(restaurantDetails.getCuisine());
                    return ResponseEntity.ok(service.saveRestaurant(restaurant));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
        if (service.getRestaurantById(id).isPresent()) {
            service.deleteRestaurant(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
