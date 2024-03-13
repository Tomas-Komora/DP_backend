package com.example.SpringBootDP.DTO.subscriber;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TariffDTO {
    private String tariffId;
    private String tariffName;
    private int tariffType;
    private String tariffTypeEnum;
    private String status;
    private int includedSubscriptionSlots;
}