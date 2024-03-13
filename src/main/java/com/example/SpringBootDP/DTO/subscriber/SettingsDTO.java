package com.example.SpringBootDP.DTO.subscriber;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SettingsDTO {
    private boolean hasDigitalBox;
    private boolean hasInvoicePaymentCharge;
    private boolean hasEbillBillMediaType;
    private boolean hasMktForMobappDisabled;
}
