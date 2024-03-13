package com.example.SpringBootDP.DTO.servicesAndUsages;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AccumulatedChargeDTO {
    private String chargeUnit;
    private Integer chargeQuantity;
    private Double chargeValue;
    private Double chargeValueWithVAT;
}
