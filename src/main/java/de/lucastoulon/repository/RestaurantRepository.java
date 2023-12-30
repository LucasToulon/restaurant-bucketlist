package de.lucastoulon.repository;
import de.lucastoulon.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    // Custom query methods if needed
}
