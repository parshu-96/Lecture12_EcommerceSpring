package org.example.ecommercespring.mappers;


import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.entity.Product;

public class ProductMapper {

    public static ProductDTO productDTO(Product product)
    {
        return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .image(product.getImage())
                .price(product.getPrice())
                .description(product.getDescription())
                .brand(product.getBrand())
                .model(product.getModel())
                .color(product.getColor())
                .category(product.getCategory())
                .isPopular(product.isPopular())
                .discount(product.getDiscount())
                .onSale(product.isOnSale())
                .build();
    }
    public static Product toEntity(ProductDTO productDTO)
    {
        return Product.builder()
                .id(productDTO.getId())
                .title(productDTO.getTitle())
                .image(productDTO.getImage())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .brand(productDTO.getBrand())
                .model(productDTO.getModel())
                .color(productDTO.getColor())
                .category(productDTO.getCategory())
                .isPopular(productDTO.isPopular())
                .discount(productDTO.getDiscount())
                .onSale(productDTO.isOnSale())
                .build();
    }
}
