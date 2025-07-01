package org.example.ecommercespring.mappers;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;

import java.util.List;

public class GetAllCaterogoriesMapper {
    public static FakeStoreCategoryResponseDTO toFakeStoreCategoryDTO() {
        return null;
    }

    public static List<CategoryDTO> toCategoryDTO(FakeStoreCategoryResponseDTO responseDTO) {
        return responseDTO.getCategories().stream().map(category -> CategoryDTO.builder().name(category).build()).toList();
    }
}
