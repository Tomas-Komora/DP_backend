package com.example.SpringBootDP.DTO.appSlots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AppSlotDTO {
    private String productId;
    private String productName;
    private String type;
    private String allowedModification;
    private String assignedAppId;
    private AppsDTO apps;
}
