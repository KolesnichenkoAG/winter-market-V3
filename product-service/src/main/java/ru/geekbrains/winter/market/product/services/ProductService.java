package ru.geekbrains.winter.market.product.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.winter.market.product.entities.Product;
import ru.geekbrains.winter.market.product.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void createNewProduct(Product product) {
        Product p = new Product();
        product.setTitle(product.getTitle());
        product.setPrice(product.getPrice());
        productRepository.save(p);
    }
}
