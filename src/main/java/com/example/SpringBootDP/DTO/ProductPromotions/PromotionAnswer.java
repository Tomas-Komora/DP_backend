package com.example.SpringBootDP.DTO.ProductPromotions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PromotionAnswer {
    private String id;
    private Integer priority;
    private String displayValue;
}
