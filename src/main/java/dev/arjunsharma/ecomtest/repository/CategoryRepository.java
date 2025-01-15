package dev.arjunsharma.ecomtest.repository;

import dev.arjunsharma.ecomtest.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Optional<Category> getCategoryByName(String name);
}
