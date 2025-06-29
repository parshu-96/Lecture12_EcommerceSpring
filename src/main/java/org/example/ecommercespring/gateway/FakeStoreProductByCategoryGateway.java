package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.FakeStoreGetProductByIDResponseDTO;
import org.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.gateway.api.IFakeStoreGetProductAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductByCategoryGateway implements IProductGateway {
    private final IFakeStoreGetProductAPI iFakeStoreGetProductAPI;

    public FakeStoreProductByCategoryGateway(IFakeStoreGetProductAPI iFakeStoreGetProductAPI) {
        this.iFakeStoreGetProductAPI = iFakeStoreGetProductAPI;
    }


    @Override
    public List<ProductDTO> getAllProductsByCateogory(String category) throws IOException {
        FakeStoreProductResponseDTO responseDTO = this.iFakeStoreGetProductAPI.getAllFakeProductsBYCategory(category).execute().body();
        if(responseDTO==null)
        {
            throw new IOException("Failed to fetch products by given category");
        }
        return responseDTO.getProducts();
    }

    @Override
    public ProductDTO getProductById(int id) throws IOException {
        FakeStoreGetProductByIDResponseDTO responseDTO =this.iFakeStoreGetProductAPI.getProductById(id).execute().body();
        if(responseDTO==null)
        {
            throw new IOException("Failed to fetch products by given category");
        }
        return responseDTO.getProduct();
    }
}
