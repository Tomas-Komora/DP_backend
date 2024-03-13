package com.example.SpringBootDP.DTO.servicesAndUsages;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class UsageSummaryDTO {
    private Double priceAfterAppliedFU;
    private Double priceAfterAppliedFUWithVAT;
    private List<AccumulatedChargeDTO> accummulatedCharges;
}
