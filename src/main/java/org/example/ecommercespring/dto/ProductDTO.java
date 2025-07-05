package org.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private long id;
    private String title;
    private  String image;
    private double price;
    private String description;
    private String brand;
    private String model;
   private String color;
   private String category;
   private boolean isPopular;
   private int discount;
   private boolean onSale;

}
