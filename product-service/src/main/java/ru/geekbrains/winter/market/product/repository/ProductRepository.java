package ru.geekbrains.winter.market.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.winter.market.product.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}