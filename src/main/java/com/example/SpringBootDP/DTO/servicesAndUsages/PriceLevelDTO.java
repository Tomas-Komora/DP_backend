package com.example.SpringBootDP.DTO.servicesAndUsages;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PriceLevelDTO {
    private String priceList;
    private Double priceWithVAT;
    private Boolean isEnabled;
    private Boolean isActive;
}
