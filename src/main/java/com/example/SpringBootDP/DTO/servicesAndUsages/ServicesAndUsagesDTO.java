package com.example.SpringBootDP.DTO.servicesAndUsages;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ServicesAndUsagesDTO {
    private List<ServicesDTO> Service;
    private String UsageAt;
    private UsageSummaryDTO UsageSummary;
    private int LastRoamingZone;
}
