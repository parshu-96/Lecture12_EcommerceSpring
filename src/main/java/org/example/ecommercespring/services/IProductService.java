package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductsByCategory(String category) throws IOException;
}
