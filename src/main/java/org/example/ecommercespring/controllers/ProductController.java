package org.example.ecommercespring.controllers;

import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.Body;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    private final IProductService productService;


    public ProductController(IProductService iProductService) {
        this.productService = iProductService;
    }

    @GetMapping("/category")
    List<ProductDTO> getAllProductsByCategory(@RequestParam("type") String category) throws IOException {
        return productService.getProductsByCategory(category);
    }

    @GetMapping("/{id}")
    ProductDTO getProductById(@PathVariable("id") long id) throws IOException {
        return productService.getProductById(id);
    }

    public ResponseEntity<ProductDTO> createProduct(@Body ProductDTO productDTO) {
        // This method is not implemented in the service, so it will return null.
        // You can implement it in the service if needed.
        return ResponseEntity.ok(null);
    }
}
