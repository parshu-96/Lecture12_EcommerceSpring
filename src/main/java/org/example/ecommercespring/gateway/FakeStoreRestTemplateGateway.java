package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import org.example.ecommercespring.mappers.GetAllCaterogoriesMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreRestTemplateGateway")
public class FakeStoreRestTemplateGateway implements ICategoryGateway {

    private final RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakestoreapi.in/api/products/category";
        restTemplate.getForEntity(url, FakeStoreCategoryResponseDTO.class);
        ResponseEntity<FakeStoreCategoryResponseDTO> responseDTO = restTemplate.getForEntity(url, FakeStoreCategoryResponseDTO.class);
        if (responseDTO.getBody() == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        return GetAllCaterogoriesMapper.toCategoryDTO(responseDTO.getBody());

    }
}
