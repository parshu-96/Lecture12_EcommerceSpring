package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.entity.Product;
import org.example.ecommercespring.mappers.ProductMapper;
import org.example.ecommercespring.repository.ProductRepository;

import java.io.IOException;
import java.util.List;

public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        return List.of();
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return productRepository.findById(id)
                .map(ProductMapper::productDTO)
                .orElseThrow(() -> new IOException("Product not found with id: " + id));
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product newProduct = productRepository.save(ProductMapper.toEntity(productDTO));
        return ProductMapper.productDTO(newProduct);

    }
}
