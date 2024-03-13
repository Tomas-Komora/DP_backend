package com.example.SpringBootDP.DTO.ProductPromotions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ProductPromotions {
    private List<ProductPromotion> productPromotion;
}
