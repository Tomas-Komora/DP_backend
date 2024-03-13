package com.example.SpringBootDP.DTO.appSlots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AppDTO {
    private String productId;
    private String productName;
    private String category;
    private String status;
    private String allowedModification;
    private String iconURL;
    private String description;
    private String activeTo;
    private Long instanceId;
    private String productGroup;
}
