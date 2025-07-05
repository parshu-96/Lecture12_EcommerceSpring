package org.example.ecommercespring.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity{
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
