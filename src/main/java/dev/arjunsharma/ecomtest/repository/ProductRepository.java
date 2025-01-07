package dev.arjunsharma.ecomtest.repository;

import dev.arjunsharma.ecomtest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// next time explain, Entity, datatype of PK
public interface ProductRepository extends JpaRepository<Product, Long> {

}
