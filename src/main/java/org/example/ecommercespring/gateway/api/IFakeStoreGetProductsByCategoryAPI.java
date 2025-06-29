package org.example.ecommercespring.gateway.api;

import org.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IFakeStoreGetProductsByCategoryAPI {
    @GET("products/category")
    Call<FakeStoreProductResponseDTO> getAllFakeProductsBYCategory(@Query("type") String category);
}
