package org.example.ecommercespring.gateway.api;

import org.example.ecommercespring.dto.FakeStoreGetProductByIDResponseDTO;
import org.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import org.example.ecommercespring.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IFakeStoreGetProductAPI {
    @GET("products/category")
    Call<FakeStoreProductResponseDTO> getAllFakeProductsBYCategory(@Query("type") String category);

    @GET("products/{id}")
    Call<FakeStoreGetProductByIDResponseDTO> getProductById(@Path("id") int id);
}
