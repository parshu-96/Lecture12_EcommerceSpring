package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.gateway.api.IFakeStoreGetProductsByCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductByCategoryGateway implements IProductGateway {
    private final IFakeStoreGetProductsByCategoryAPI iFakeStoreGetProductsByCategoryAPI;

    public FakeStoreProductByCategoryGateway(IFakeStoreGetProductsByCategoryAPI iFakeStoreGetProductsByCategoryAPI) {
        this.iFakeStoreGetProductsByCategoryAPI = iFakeStoreGetProductsByCategoryAPI;
    }


    @Override
    public List<ProductDTO> getAllProductsByCateogory(String category) throws IOException {
        FakeStoreProductResponseDTO responseDTO = this.iFakeStoreGetProductsByCategoryAPI.getAllFakeProductsBYCategory(category).execute().body();
        if(responseDTO==null)
        {
            throw new IOException("Failed to fetch products by given category");
        }
        return responseDTO.getProducts();
    }
}
