package org.example.ecommercespring.controllers;

import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.services.IProductService;
import org.springframework.web.bind.annotation.*;

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
    ProductDTO getProductById(@PathVariable("id") int id) throws IOException {
        return productService.getProductById(id);
    }
}
