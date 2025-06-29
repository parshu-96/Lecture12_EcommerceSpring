package org.example.ecommercespring.configuration;

import org.example.ecommercespring.gateway.api.IFakeStoreCategoryAPI;
import org.example.ecommercespring.gateway.api.IFakeStoreGetProductsByCategoryAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    @Value("${FAKE_STORE_BASE_URL}") // Name should match key in .env
    private String baseUrl;
    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public IFakeStoreCategoryAPI iFakeStoreCategoryAPI(Retrofit retrofit){
        return retrofit.create(IFakeStoreCategoryAPI.class);
    }
    
    @Bean
    public IFakeStoreGetProductsByCategoryAPI iFakeStoreGetProductsByCategoryAPI(Retrofit retrofit)
    {
        return retrofit.create(IFakeStoreGetProductsByCategoryAPI.class);
    }
}
