package org.example.ecommercespring.controllers;

import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products/category")
public class ProductController {

    private final IProductService productService;


    public ProductController(IProductService iProductService) {
        this.productService = iProductService;
    }

    @GetMapping
    List<ProductDTO> getAllProductsByCategory(@RequestParam("type") String category) throws IOException {
        return productService.getProductsByCategory(category);
    }
}
