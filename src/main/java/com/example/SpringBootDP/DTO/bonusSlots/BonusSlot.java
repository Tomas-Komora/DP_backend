package com.example.SpringBootDP.DTO.bonusSlots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BonusSlot {
    private String productId;
    private String productName;
    private String type;
    private Object allowedModification;
    private String category;
    private String status;
    private String iconURL;
    private String description;
    private String activeTo;
    private long instanceId;
}
