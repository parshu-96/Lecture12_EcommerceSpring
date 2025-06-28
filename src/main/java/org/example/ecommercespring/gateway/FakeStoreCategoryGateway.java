package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import org.example.ecommercespring.gateway.api.IFakeStoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final IFakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(IFakeStoreCategoryAPI fakeStoreCategoryAPI) {
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        //1. Make the http request to fakestore API to fetch all categories
        FakeStoreCategoryResponseDTO responseDTO= this.fakeStoreCategoryAPI.getAllFakeCategories().execute().body();

        //2. Check if response is not null and throw IOException if it's
        if(responseDTO==null)
        {
            new IOException("Failed to fetch categories from FakeStore API");
        }
        //Map the resposne to a list of category DTO Objects.
        return responseDTO.getCategories().
                stream()
                .map(category->CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
