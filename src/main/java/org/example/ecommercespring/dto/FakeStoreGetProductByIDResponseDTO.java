package org.example.ecommercespring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreGetProductByIDResponseDTO {
    private String status;
    private String message;
    private ProductDTO product;
}
