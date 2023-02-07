package ru.geekbrains.winter.market.front.integration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.geekbrains.winter.market.product.entities.Product;

@Component
@RequiredArgsConstructor
public class ProductServiceIntegration {
    private final RestTemplate restTemplate;

    public Product findById(Long id) {
        return restTemplate.getForObject("http://localhost:8190/winter-product/api/v1/products/" + id, Product.class);
    }
}
