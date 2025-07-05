package org.example.ecommercespring.repository;

import org.example.ecommercespring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    // This interface will automatically provide CRUD operations for Product entities
    // Additional custom query methods can be defined here if needed
}
