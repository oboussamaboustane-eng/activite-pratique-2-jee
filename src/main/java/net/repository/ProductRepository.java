package net.repository;

import net.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Méthode de recherche par mot-clé dans le nom (Query Method)
    List<Product> findByNameContains(String keyword);
}