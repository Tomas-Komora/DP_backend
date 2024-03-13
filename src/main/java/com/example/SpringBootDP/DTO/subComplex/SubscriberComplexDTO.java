package com.example.SpringBootDP.DTO.subComplex;

import com.example.SpringBootDP.DTO.ProductPromotions.ProductPromotionsDTO;
import com.example.SpringBootDP.DTO.SsoAccount.SsoAccountDTO;
import com.example.SpringBootDP.DTO.appSlots.RootDTO;
import com.example.SpringBootDP.DTO.approvals.ApprovalsDTO;
import com.example.SpringBootDP.DTO.bonusSlots.BonusSlotSDTO;
import com.example.SpringBootDP.DTO.servicesAndUsages.RootServicesAndUsagesDTO;
import com.example.SpringBootDP.DTO.servicesAndUsages.ServicesAndUsagesDTO;
import com.example.SpringBootDP.DTO.subscriber.SubscriberDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SubscriberComplexDTO {
    private com.example.SpringBootDP.DTO.subscriber.RootDTO subscriber;
    private RootServicesAndUsagesDTO servicesAndUsages;
    private RootDTO appSlots;
    private BonusSlotSDTO bonusSlots;
    private ProductPromotionsDTO productPromotions;
    private ApprovalsDTO approvals;
    private SsoAccountDTO ssoAccount;
}
