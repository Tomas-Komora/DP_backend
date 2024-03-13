package com.example.SpringBootDP.DTO.servicesAndUsages;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ServicesDTO {
    private String ProductId;
    private String ProductName;
    private String ServiceGroup;
    private String Status;
    private String ActivateOn;
    private int ListPriority;
    private long InstanceId;
    private String AllowedModificationV2;
    private double PriceWithVAT;
    private double ListPriceWithVAT;
    private String Period;
    private String ProtectionPeriodEndDate;
    private String ValidTo;
    private Boolean IsMultiInstance;
    private String ActivationCode;
    private List<PriceLevelDTO> PriceLevels;
    private String Type;
}
