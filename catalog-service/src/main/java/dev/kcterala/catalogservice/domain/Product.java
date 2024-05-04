package dev.kcterala.catalogservice.domain;

import java.math.BigDecimal;

public record Product(String code, String name, String description, String imageUrl, BigDecimal price) {

    static Product toProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}
