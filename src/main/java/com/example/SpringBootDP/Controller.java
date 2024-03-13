package com.example.SpringBootDP;

import com.example.SpringBootDP.DTO.ProductPromotions.ProductPromotionsDTO;
import com.example.SpringBootDP.DTO.SsoAccount.SsoAccountDTO;
import com.example.SpringBootDP.DTO.appSlots.RootDTO;
import com.example.SpringBootDP.DTO.approvals.ApprovalsDTO;
import com.example.SpringBootDP.DTO.bonusSlots.BonusSlotSDTO;
import com.example.SpringBootDP.DTO.servicesAndUsages.RootServicesAndUsagesDTO;
import com.example.SpringBootDP.DTO.servicesAndUsages.ServicesAndUsagesDTO;
import com.example.SpringBootDP.DTO.subComplex.SubComplexDTO;
import com.example.SpringBootDP.DTO.subscriber.SubscriberDTO;
import com.example.SpringBootDP.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class Controller {

    private final MainService mainService;



    @GetMapping("/subscriber")
    public com.example.SpringBootDP.DTO.subscriber.RootDTO subscriber() {
        return mainService.getSubscriberDTO();
    }

    @GetMapping("/servicesAndUsages")
    public RootServicesAndUsagesDTO servicesAndUsagesDTO() {
        return mainService.getServicesAndUsagesDTO();
    }

    @GetMapping("/approvals")
    public ApprovalsDTO approvalsDTO() {
        return mainService.getApprovalsDto();
    }

    @GetMapping("/bonusSlots")
    public BonusSlotSDTO bonusSlotSDTO() {
        return mainService.getBonusSlotsDTO();
    }

    @GetMapping("/ssoAccount")
    public SsoAccountDTO ssoAccountDTO() {
        return mainService.getSsoAccount();
    }

    @GetMapping("/productPromotions")
    public ProductPromotionsDTO productPromotionsDTO() {
        return mainService.getProductPromotions();
    }


    @GetMapping("/appSlots")
    public RootDTO appSlotsDTO() {
        return mainService.getAppsSlot();
    }

    @GetMapping("/subComplex")
    public SubComplexDTO subComplexDTO() {
        return mainService.getSubComplex();
    }


}
