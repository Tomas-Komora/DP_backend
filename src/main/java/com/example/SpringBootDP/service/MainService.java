package com.example.SpringBootDP.service;

import com.example.SpringBootDP.DTO.ProductPromotions.ProductPromotion;
import com.example.SpringBootDP.DTO.ProductPromotions.ProductPromotions;
import com.example.SpringBootDP.DTO.ProductPromotions.ProductPromotionsDTO;
import com.example.SpringBootDP.DTO.ProductPromotions.PromotionAnswer;
import com.example.SpringBootDP.DTO.SsoAccount.SsoAccount;
import com.example.SpringBootDP.DTO.SsoAccount.SsoAccountDTO;
import com.example.SpringBootDP.DTO.appSlots.*;
import com.example.SpringBootDP.DTO.approvals.Approval;
import com.example.SpringBootDP.DTO.approvals.Approvals;
import com.example.SpringBootDP.DTO.approvals.ApprovalsDTO;
import com.example.SpringBootDP.DTO.approvals.CommunicationChannels;
import com.example.SpringBootDP.DTO.bonusSlots.BonusSlot;
import com.example.SpringBootDP.DTO.bonusSlots.BonusSlotSDTO;
import com.example.SpringBootDP.DTO.bonusSlots.BonusSlots;
import com.example.SpringBootDP.DTO.servicesAndUsages.*;
import com.example.SpringBootDP.DTO.subComplex.SubComplexDTO;
import com.example.SpringBootDP.DTO.subComplex.SubscriberComplexDTO;
import com.example.SpringBootDP.DTO.subscriber.EmailDTO;
import com.example.SpringBootDP.DTO.subscriber.SettingsDTO;
import com.example.SpringBootDP.DTO.subscriber.SubscriberDTO;
import com.example.SpringBootDP.DTO.subscriber.TariffDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    public com.example.SpringBootDP.DTO.subscriber.RootDTO getSubscriberDTO() {
        com.example.SpringBootDP.DTO.subscriber.RootDTO rootDTO = new com.example.SpringBootDP.DTO.subscriber.RootDTO();
        SubscriberDTO subscriberDTO = new SubscriberDTO();

        // Set values for SubscriberDTO
        subscriberDTO.setScratchDay("WEDNESDAY");
        subscriberDTO.setEligibleForApp(true);
        subscriberDTO.setSubscriberType("postpaid");
        subscriberDTO.setSubscriberId(15007555);
        subscriberDTO.setMsisdn(948938054);
        subscriberDTO.setAssetLastUpdatedAt("2020-12-08T14:02:07.23+01:00");

        // Create TariffDTO
        List<TariffDTO> tariffs = new ArrayList<>();
        TariffDTO tariffDTO = new TariffDTO();
        tariffDTO.setTariffId("O4:POP:TARIF:FENIX_UNL");
        tariffDTO.setTariffName("Bezstarostný  Paušál");
        tariffDTO.setTariffType(3);
        tariffDTO.setTariffTypeEnum("POSTPAID");
        tariffDTO.setStatus("A");
        tariffDTO.setIncludedSubscriptionSlots(2);
        tariffs.add(tariffDTO);
        subscriberDTO.setTariffs(tariffs);

        subscriberDTO.setActivationDate("2020-12-08T13:59:01+01:00");
        subscriberDTO.setStatus("A");
        subscriberDTO.setStatusDate("2020-12-08T13:59:01+01:00");
        subscriberDTO.setStatusReason("activation");
        subscriberDTO.setBACuRefNo(88126112);
        subscriberDTO.setBAName("Jasenie 128");
        subscriberDTO.setBPFirstName("Tomas");
        subscriberDTO.setBPCuRefNo(80258858);
        subscriberDTO.setBusinessSegment(false);
        subscriberDTO.setSelfServiceManagement(true);
        subscriberDTO.setStartOfBC(LocalDate.parse("2021-12-15"));
        subscriberDTO.setEndOfBC(LocalDate.parse("2022-01-14"));
        subscriberDTO.setDaysTillEndOfBC(23);
        subscriberDTO.setBillCycleId("01");
        subscriberDTO.setChangedTariffInCurrentBc(false);
        subscriberDTO.setBillMediaType("EBill");

        // Create EmailDTO
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setEInvoiceEmail("tomasikkomora@gmail.com");
        emailDTO.setBPEmail("tomasikkomora@gmail.com");
        emailDTO.setZekVerificationStatus("VERIFIED_INTERNALLY");
        subscriberDTO.setEmail(emailDTO);

        // Create SettingsDTO
        SettingsDTO settingsDTO = new SettingsDTO();
        settingsDTO.setHasDigitalBox(true);
        settingsDTO.setHasInvoicePaymentCharge(false);
        settingsDTO.setHasEbillBillMediaType(true);
        settingsDTO.setHasMktForMobappDisabled(true);
        subscriberDTO.setSettings(settingsDTO);

        subscriberDTO.setHasMoreSubscribers("Yes");
        subscriberDTO.setHasMoreBillingArrangements("No");

        rootDTO.setSubscriber(subscriberDTO);
        return rootDTO;
    }

    public RootServicesAndUsagesDTO getServicesAndUsagesDTO(){
        ServicesAndUsagesDTO servicesAndUsage = new ServicesAndUsagesDTO();

        // Set additional properties of servicesAndUsage
        servicesAndUsage.setUsageAt("2020-12-08T15:25:11.625+01:00");
        servicesAndUsage.setLastRoamingZone(1);

        // Create a sample service
        List<ServicesDTO> services = new ArrayList<>();
        ServicesDTO service = new ServicesDTO();
        service.setProductId(":PROV:POP:ROAMING");
        service.setProductName("Využívanie služieb v roamingu");
        service.setServiceGroup("A");
        service.setType("DATA");
        service.setIsMultiInstance(false);
        service.setStatus("A");
        service.setValidTo("2020-12-08T13:59:01+01:00");
        service.setPeriod("M");
        service.setType("DATA");
        service.setActivateOn("2020-12-08T13:59:01+01:00");
        service.setListPriority(226900);
        service.setInstanceId(55857988L);
        service.setActivationCode("ROAMING_CODE");
        service.setAllowedModificationV2("D");
        service.setProtectionPeriodEndDate("2020-12-08T13:59:01+01:00");
        List<PriceLevelDTO> priceLevels11 = new ArrayList<>();
        PriceLevelDTO priceLevelDTO11 = new PriceLevelDTO();
        priceLevelDTO11.setPriceList("Discounted");
        priceLevelDTO11.setPriceWithVAT(4.99);
        priceLevelDTO11.setIsActive(true);
        priceLevelDTO11.setIsEnabled(true);
        priceLevels11.add(priceLevelDTO11);
        service.setPriceLevels(priceLevels11);
        services.add(service);

        ServicesDTO service1 = new ServicesDTO();
        service1.setProductId(":POP:INTERNET");
        service1.setProductName("Prístup na internet");
        service1.setType("DATA");
        service1.setServiceGroup("A");
        service1.setStatus("A");
        service1.setValidTo("2020-12-08T13:59:01+01:00");
        service1.setType("DATA");
        service1.setPeriod("M");
        service1.setActivateOn("2020-12-08T13:59:01+01:00");
        service1.setListPriority(0);
        service1.setInstanceId(55857992);
        service1.setProtectionPeriodEndDate("2020-12-08T13:59:01+01:00");
        service1.setIsMultiInstance(false);
        service1.setActivationCode("INTERNET_CODE");
        List<PriceLevelDTO> priceLevels12 = new ArrayList<>();
        PriceLevelDTO priceLevelDTO12 = new PriceLevelDTO();
        priceLevelDTO12.setPriceList("Discounted");
        priceLevelDTO12.setPriceWithVAT(4.99);
        priceLevelDTO12.setIsActive(true);
        priceLevelDTO12.setIsEnabled(true);
        priceLevels12.add(priceLevelDTO12);
        service1.setPriceLevels(priceLevels12);
        service1.setAllowedModificationV2("D");
        services.add(service1);

        ServicesDTO service2 = new ServicesDTO();
        service2.setProductId(":POP:APP:FENIX:HBOMAX");
        service2.setProductName("HBO Max");
        service2.setServiceGroup("E");
        service2.setType("DATA_APP");
        service2.setStatus("A");
        service2.setActivateOn("2022-12-19T16:16:49+01:00");
        service2.setListPriority(120);
        service2.setInstanceId(86210784);
        service2.setPriceWithVAT(6.99);
        service2.setListPriceWithVAT(6.99);
        service2.setPeriod("M");
        service2.setProtectionPeriodEndDate("2023-01-18T00:00:00");
        service2.setValidTo("2023-01-16T00:00:00+01:00");
        service2.setIsMultiInstance(false);
        service2.setActivationCode("HBO_CODE");
        service2.setAllowedModificationV2("MD");

        List<PriceLevelDTO> priceLevels = new ArrayList<>();

        PriceLevelDTO priceLevelDTO = new PriceLevelDTO();
        priceLevelDTO.setPriceList("Standard");
        priceLevelDTO.setPriceWithVAT(6.99);
        priceLevelDTO.setIsEnabled(true);
        priceLevelDTO.setIsActive(true);
        priceLevels.add(priceLevelDTO);
        PriceLevelDTO priceLevelDTO1 = new PriceLevelDTO();
        priceLevelDTO1.setPriceList("Included");
        priceLevelDTO1.setPriceWithVAT(0.0);
        priceLevelDTO1.setIsEnabled(false);
        priceLevelDTO1.setIsActive(false);
        priceLevels.add(priceLevelDTO1);
        service2.setPriceLevels(priceLevels);
        services.add(service2);

        ServicesDTO service3 = new ServicesDTO();
        service3.setProductId(":POP:APP:FENIX:DENNIK_N");
        service3.setProductName("Denník N");
        service3.setServiceGroup("E");
        service3.setType("DATA_APP");
        service3.setStatus("A");
        service3.setValidTo("2020-12-08T13:59:01+01:00");
        service3.setListPriority(160);
        service3.setProtectionPeriodEndDate("2020-12-08T13:59:01+01:00");
        service3.setPriceWithVAT(0.0);
        service3.setListPriceWithVAT(0.0);
        service3.setActivationCode("DENNIKN_CODE");

        List<PriceLevelDTO> priceLevels1 = new ArrayList<>();
        PriceLevelDTO priceLevelDTO2 = new PriceLevelDTO();
        priceLevelDTO2.setPriceList("Discounted");
        priceLevelDTO2.setPriceWithVAT(4.99);
        priceLevelDTO2.setIsEnabled(true);
        priceLevelDTO2.setIsActive(true);
        priceLevels1.add(priceLevelDTO2);

        PriceLevelDTO priceLevelDTO3 = new PriceLevelDTO();
        priceLevelDTO3.setPriceList("Included");
        priceLevelDTO3.setPriceWithVAT(0.0);
        priceLevelDTO3.setIsEnabled(true);
        priceLevelDTO3.setIsActive(true);
        priceLevels1.add(priceLevelDTO3);
        service3.setPriceLevels(priceLevels1);
        service3.setActivateOn("2020-12-08T13:59:01+01:00");
        service3.setPeriod("M");
        service3.setAllowedModificationV2("MD");
        service3.setInstanceId(55858102);
        service3.setIsMultiInstance(false);

        services.add(service3);

        ServicesDTO service4 = new ServicesDTO();
        service4.setProductId(":POP:APP:FENIX:TV");
        service4.setProductName(" TV");
        service4.setServiceGroup("E");
        service4.setValidTo("2020-12-08T13:59:01+01:00");
        service4.setActivationCode("TV_CODE");
        service4.setType("DATA_APP");
        service4.setStatus("A");
        service4.setListPriority(131);
        service4.setPriceWithVAT(12.0);
        service4.setProtectionPeriodEndDate("2020-12-08T13:59:01+01:00");
        service4.setListPriceWithVAT(12.0);

        List<PriceLevelDTO> priceLevels2 = new ArrayList<>();
        PriceLevelDTO priceLevelDTO4 = new PriceLevelDTO();
        priceLevelDTO4.setPriceList("Standard");
        priceLevelDTO4.setPriceWithVAT(12.0);
        priceLevelDTO4.setIsEnabled(true);
        priceLevelDTO4.setIsActive(true);
        priceLevels2.add(priceLevelDTO4);

        PriceLevelDTO priceLevelDTO5 = new PriceLevelDTO();
        priceLevelDTO5.setPriceList("Included");
        priceLevelDTO5.setPriceWithVAT(0.0);
        priceLevelDTO5.setIsActive(true);
        priceLevelDTO5.setIsEnabled(true);
        priceLevels2.add(priceLevelDTO5);
        service4.setPriceLevels(priceLevels2);

        service4.setPeriod("M");
        service4.setAllowedModificationV2("MD");
        service4.setInstanceId(55858101);
        service4.setIsMultiInstance(false);
        service4.setActivateOn("2020-12-08T13:59:01+01:00");
        services.add(service4);

        ServicesDTO service5 = new ServicesDTO();
        service5.setProductId(":POP:APP:FENIX:NETFLIX_BASIC");
        service5.setProductName("Netflix Basic");
        service5.setServiceGroup("E");
        service5.setType("DATA_APP");
        service5.setStatus("A");
        service5.setValidTo("2020-12-08T13:59:01+01:00");
        service5.setListPriority(1131);
        service5.setProtectionPeriodEndDate("2020-12-08T13:59:01+01:00");
        service5.setPriceWithVAT(7.99);
        service5.setActivationCode("NETFLIXB_CODE");
        service5.setListPriceWithVAT(7.99);

        List<PriceLevelDTO> priceLevels3 = new ArrayList<>();
        PriceLevelDTO priceLevelDTO6 = new PriceLevelDTO();
        priceLevelDTO6.setPriceList("Standard");
        priceLevelDTO6.setPriceWithVAT(7.99);
        priceLevelDTO6.setIsEnabled(true);
        priceLevelDTO6.setIsActive(true);
        priceLevels3.add(priceLevelDTO6);

        PriceLevelDTO priceLevelDTO7 = new PriceLevelDTO();
        priceLevelDTO7.setPriceList("Included");
        priceLevelDTO7.setPriceWithVAT(2.0);
        priceLevelDTO7.setIsEnabled(true);
        priceLevelDTO7.setIsActive(true);
        priceLevels3.add(priceLevelDTO7);
        service5.setPriceLevels(priceLevels3);

        service5.setPeriod("M");
        service5.setAllowedModificationV2("MD");
        service5.setInstanceId(55858107);
        service5.setIsMultiInstance(false);
        service5.setActivateOn("2020-12-08T13:59:01+01:00");

        services.add(service5);


        servicesAndUsage.setUsageAt("2020-12-08T15:25:11.625+01:00");

        UsageSummaryDTO usageSummaryDTO = new UsageSummaryDTO();
        usageSummaryDTO.setPriceAfterAppliedFU(0.0);
        usageSummaryDTO.setPriceAfterAppliedFUWithVAT(2.26);

        List<AccumulatedChargeDTO> accumulatedCharges = new ArrayList<>();
        String[] chargeUnits = {"MIN", "VoiceNonFree", "MB", "DataNonFree", "SMS/MMS", "SMS_MMS_VASNonFree", "DISCOUNTS_OTHER", "COMPENSATION", "DISCOUNTS_OTHER2", "ADDON_CHARGES", "OTC"};
        int[] chargeQuantities = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        double[] chargeValues = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double[] chargeValuesWithVAT = {0, 0, 0, 0, 0, 0, -21.91, 0, -21.91, 0, 0};

        for (int i = 0; i < chargeUnits.length; i++) {
            AccumulatedChargeDTO charge = new AccumulatedChargeDTO();
            charge.setChargeUnit(chargeUnits[i]);
            if (i < chargeQuantities.length) {
                charge.setChargeQuantity(chargeQuantities[i]);
            } else {
                charge.setChargeQuantity(0);
            }
            if (i < chargeValues.length) {
                charge.setChargeValue(chargeValues[i]);
            } else {
                charge.setChargeValue(0.0);
            }
            charge.setChargeValueWithVAT(chargeValuesWithVAT[i]);

            accumulatedCharges.add(charge);
        }
        usageSummaryDTO.setAccummulatedCharges(accumulatedCharges);
        servicesAndUsage.setUsageSummary(usageSummaryDTO);
        servicesAndUsage.setLastRoamingZone(1);
        servicesAndUsage.setService(services);

        RootServicesAndUsagesDTO rootServicesAndUsagesDTO = new RootServicesAndUsagesDTO();
        rootServicesAndUsagesDTO.setServicesAndUsage(servicesAndUsage);
        // Return the filled ServiceData object
        return rootServicesAndUsagesDTO;
    }

    public ApprovalsDTO getApprovalsDto(){

        ApprovalsDTO approvalsDTO = new ApprovalsDTO();
        Approvals approvals = new Approvals();

        List<Approval> approvalList = new ArrayList<>();
        Approval approval = new Approval();
        approval.setName("Personal data HC");
        approval.setApproved(true);
        approval.setValidFrom("2015-08-09T18:13:02+02:00");
        approval.setIsApprovalSettable(false);

        approvalList.add(approval);

        Approval approval1 = new Approval();
        approval1.setName("Register SOLUS HC");
        approval1.setApproved(true);
        approval1.setValidFrom("2015-08-09T18:13:02+02:00");
        approval1.setIsApprovalSettable(false);
        approvalList.add(approval1);

        Approval approval2 = new Approval();
        approval2.setName("Register NRKI HC");
        approval2.setApproved(true);
        approval2.setValidFrom("2015-08-09T18:13:02+02:00");
        approval2.setIsApprovalSettable(false);
        approvalList.add(approval2);

        Approval approval3 = new Approval();
        approval3.setName("Register HC");
        approval3.setApproved(true);
        approval3.setValidFrom("2015-08-09T17:25:12+02:00");
        approval3.setIsApprovalSettable(false);
        approvalList.add(approval3);

        Approval approval4 = new Approval();
        approval4.setName("Personal data HC");
        approval4.setApproved(true);
        approval4.setValidFrom("2015-08-09T17:25:12+02:00");
        approval4.setIsApprovalSettable(false);
        approvalList.add(approval4);

        Approval approval5 = new Approval();
        approval5.setName("Register SOLUS HC");
        approval5.setApproved(true);
        approval5.setValidFrom("2015-08-09T17:25:12+02:00");
        approval5.setIsApprovalSettable(false);
        approvalList.add(approval5);


        Approval approval6 = new Approval();
        approval6.setName("Register NRKI HC");
        approval6.setApproved(true);
        approval6.setValidFrom("2015-08-09T17:25:12+02:00");
        approval6.setIsApprovalSettable(false);
        approvalList.add(approval6);

        Approval approval7 = new Approval();
        approval7.setName("Digital BOX KTK");
        approval7.setApproved(true);
        approval7.setApprovalCheckboxName("CheckboxDigitalBox");
        approval7.setValidFrom("2020-05-13T22:01:12+02:00");
        approval7.setIsApprovalSettable(true);
        approvalList.add(approval7);

        Approval approval8 = new Approval();
        approval8.setName("Mkt MDDR");
        approval8.setApproved(true);
        approval8.setValidFrom("2018-07-03T14:31:10+02:00");
        approval8.setIsApprovalSettable(true);
        approvalList.add(approval8);

        Approval approval10 = new Approval();
        approval10.setName("Refusal verification through Personal ID");
        approval10.setApproved(true);
        approval10.setValidFrom("2014-02-11T11:05:20+01:00");
        approval10.setIsApprovalSettable(true);
        approvalList.add(approval10);

        Approval approval11 = new Approval();
        approval11.setName("Register CFH");
        approval11.setApproved(false);
        approval11.setValidFrom("2014-02-11T11:05:20+01:00");
        approval11.setIsApprovalSettable(false);
        approvalList.add(approval11);

        Approval approval12 = new Approval();
        approval12.setName("Register SCB");
        approval12.setApproved(true);
        approval12.setValidFrom("2017-09-28T08:47:32+02:00");
        approval12.setIsApprovalSettable(false);
        approvalList.add(approval12);

        Approval approval13 = new Approval();
        approval13.setName("Register SOLUS");
        approval13.setApproved(true);
        approval13.setValidFrom("2015-08-09T17:25:12+02:00");
        approval13.setIsApprovalSettable(false);
        approvalList.add(approval13);

        Approval approval14 = new Approval();
        approval14.setName("OptIn for internal marketing with localization");
        approval14.setApproved(true);
        approval14.setValidFrom("2018-04-28T13:08:59+02:00");
        approval14.setIsApprovalSettable(true);

        CommunicationChannels communicationChannel14 = new CommunicationChannels();
        communicationChannel14.setCommunicationChannel(Arrays.asList("web", "sms"));

        approval14.setCommunicationChannels(communicationChannel14);
        approvalList.add(approval14);

        Approval approval15 = new Approval();
        approval15.setName("Mkt2.1");
        approval15.setApproved(false);
        approval15.setApprovalCheckboxName("CheckBoxEV1");
        approval15.setValidFrom("2019-03-16T16:17:08+01:00");
        approval15.setIsApprovalSettable(true);

        CommunicationChannels communicationChannel15 = new CommunicationChannels();
        communicationChannel15.setCommunicationChannel(Arrays.asList("email", "sms"));

        approval15.setCommunicationChannels(communicationChannel15);

        approvalList.add(approval15);


        Approval approval16 = new Approval();
        approval16.setName("Mkt3.1");
        approval16.setApproved(true);
        approval16.setValidFrom("2019-03-16T16:17:08+01:00");
        approval16.setIsApprovalSettable(true);

        CommunicationChannels communicationChannel16 = new CommunicationChannels();
        communicationChannel16.setCommunicationChannel(Arrays.asList("email", "sms", "voice", "web"));

        approval16.setCommunicationChannels(communicationChannel16);

        approvalList.add(approval16);


        Approval approval17 = new Approval();
        approval17.setName("CFH marketing OptIn");
        approval17.setApproved(false);
        approval17.setValidFrom("2016-06-21T01:38:20+02:00");
        approval17.setIsApprovalSettable(false);
        approvalList.add(approval17);

        Approval approval18 = new Approval();
        approval18.setName("OptIn for external marketing with localization");
        approval18.setApproved(true);
        approval18.setValidFrom("2019-03-16T16:17:08+01:00");
        approval18.setIsApprovalSettable(true);

        CommunicationChannels communicationChannel17 = new CommunicationChannels();
        communicationChannel17.setCommunicationChannel(Arrays.asList("email", "sms", "voice", "web"));
        approval18.setCommunicationChannels(communicationChannel17);
        approvalList.add(approval18);

        Approval approval19 = new Approval();
        approval19.setName("PUSH notification");
        approval19.setApproved(true);
        approval19.setApprovalCheckboxName("PushWhatever");

        approvalList.add(approval19);


        approvals.setApproval(approvalList);
        approvalsDTO.setApprovals(approvals);



        return approvalsDTO;
    }
    public BonusSlotSDTO getBonusSlotsDTO() {
        BonusSlotSDTO bonusSlotSDTO = new BonusSlotSDTO();
        BonusSlots bonusSlots = new BonusSlots();
        List<BonusSlot> bonusSlotsList = new ArrayList<>();
        BonusSlot bonusSlot = new BonusSlot();
        bonusSlot.setProductId(":SCHED:MOBIL:BONUS");
        bonusSlot.setProductName("120 € bonus na zariadenia");
        bonusSlot.setType("HW_BONUS");
        bonusSlot.setAllowedModification(null);
        bonusSlot.setCategory("Bonusy a zľavy");
        bonusSlot.setStatus("A");
        bonusSlot.setActiveTo("2020-12-31T00:00:00+01:00");
        bonusSlot.setIconURL("static.skshop-portletimage-server1015912-original-image.png");
        bonusSlot.setInstanceId(55858000);
        bonusSlot.setDescription("Bonus na zariadenia k programu sa môže čerpať každý mesiac, v ktorom máte Mesačnú platbu za zariadenia.");

        bonusSlotsList.add(bonusSlot);
        bonusSlots.setBonusSlot(bonusSlotsList);
        bonusSlotSDTO.setBonusSlots(bonusSlots);
        return bonusSlotSDTO;
    }

    public SsoAccountDTO getSsoAccount() {
        SsoAccountDTO ssoAccountDTO = new SsoAccountDTO();
        SsoAccount ssoAccount = new SsoAccount();
        ssoAccount.setOtp("oTpValu3");
        ssoAccount.setOtpValidTo("2023-02-01T23:59:59.999+01:00");
        ssoAccountDTO.setSsoAccount(ssoAccount);
        return ssoAccountDTO;
    }

    public ProductPromotionsDTO getProductPromotions() {
        ProductPromotionsDTO productPromotionsDTO = new ProductPromotionsDTO();
        ProductPromotions productPromotions = new ProductPromotions();
        List<ProductPromotion> productPromotionList = new ArrayList<>();

        ProductPromotion productPromotion = new ProductPromotion();
        productPromotion.setPromotionId("scratchXmasNbo");
        productPromotion.setPriority(11);
        productPromotion.setText("Zotrite si vianocne prekvapenie");
        productPromotion.setContent("Zotrite si vianocne prekvapenie");
        productPromotion.setHeader("Vianočný darček pre vás.");
        productPromotion.setSubHeader("Zotrite si vianocne prekvapenie");
        productPromotion.setLabel("Získajte alebo darujte vianočné dáta pre seba alebo vašich blízkých");
        productPromotion.setStartDate("2023-09-01T00:00:00+02:00");
        productPromotion.setEndDate("2024-01-31T23:59:59+02:00");
        productPromotion.setBackgroundColourType("SCRATCH_XMAS");
        productPromotion.setOperation("Aktivácia");
        productPromotion.setPromotionAnswer(new ArrayList<>());
        productPromotion.setActionAcceptURL(null);
        productPromotion.setDisplay("TOP");
        productPromotion.setSource("PCE");
        productPromotion.setPromoGroup("SCRATCH_REGULAR");
        productPromotion.setPromoExternalId("SCRATCHCODE_REGULAR_ABC");
        productPromotion.setNboStory("moje/nbo/xmass.json");

        productPromotionList.add(productPromotion);

        ProductPromotion giftXmasNboPromotion = new ProductPromotion();
        giftXmasNboPromotion.setPromotionId("giftXmasNbo");
        giftXmasNboPromotion.setPriority(10);
        giftXmasNboPromotion.setText(" Nekonečné dáta si môžete aktivovať do 31.01.2024.");
        giftXmasNboPromotion.setContent("<b>Ako uplatniť nekonečné dáta</b><p> Nekonečné dáta si môžete aktivovať do 31.01.2024.<p>Ak máte program s platbou na faktúru (Základný/Pohodový  Paušál,  Fér na faktúru,  Dátovka,  Moja firma,  Fér Jednotka na faktúru), nekonečné dáta môžete od aktivácie využívať do konca aktuálneho zúčtovacieho obdobia a celé nasledujúce zúčtovacie obdobie.<p>Ak máte program s dobíjaním kreditu ( Voľnosť,  Fér s dobíjaním kreditu,  Fér Jednotka s dobíjaním kreditu), nekonečné dáta môžete využívať celých 30 dní od ich aktivácie.");
        giftXmasNboPromotion.setHeader(" Vianoce<br>sú tu");
        giftXmasNboPromotion.setSubHeader("A s nimi niečo špeciálne.<br>Len sa pozrite.");
        giftXmasNboPromotion.setLabel("Získajte alebo darujte vianočné dáta pre seba alebo vašich blízkých");
        giftXmasNboPromotion.setStartDate("2023-09-01T00:00:00+02:00");
        giftXmasNboPromotion.setEndDate("2024-01-31T23:59:59+02:00");
        giftXmasNboPromotion.setBackgroundColourType("GIFT_XMAS");
        giftXmasNboPromotion.setOperation("Aktivácia");
        List<PromotionAnswer> promotionAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer = new PromotionAnswer();
        promotionAnswer.setId("Agrees with Offer");
        promotionAnswer.setPriority(1);
        promotionAnswer.setDisplayValue("Aktivovať si 10 GB");
        promotionAnswers.add(promotionAnswer);

        PromotionAnswer promotionAnswer1 = new PromotionAnswer();
        promotionAnswer1.setId("Disagrees with Offer");
        promotionAnswer1.setPriority(3);
        promotionAnswer1.setDisplayValue("Nemám záujem");
        promotionAnswers.add(promotionAnswer1);

        PromotionAnswer promotionAnswer2 = new PromotionAnswer();
        promotionAnswer2.setId("Forward Offer");
        promotionAnswer2.setPriority(0);
        promotionAnswer2.setDisplayValue("Darovať nekonečno");
        promotionAnswers.add(promotionAnswer2);


        giftXmasNboPromotion.setPromotionAnswer(promotionAnswers);
        giftXmasNboPromotion.setActionAcceptURL(null);
        giftXmasNboPromotion.setDisplay("TOP");
        giftXmasNboPromotion.setSource("PCE");
        giftXmasNboPromotion.setPromoGroup("GIFT_OFFERING");
        giftXmasNboPromotion.setPromoExternalId("GO:XMAS_2023_10GB");
        giftXmasNboPromotion.setNboStory("moje/nbo/xmass.json");

        productPromotionList.add(giftXmasNboPromotion);

        ProductPromotion abcPromotion = new ProductPromotion();
        abcPromotion.setPromotionId("abc");
        abcPromotion.setLabel("Chcem darček");
        abcPromotion.setActionLabel("Action label 1");
        abcPromotion.setBackgroundColour("#a819a8");
        abcPromotion.setBackgroundColourType("GOLD");
        abcPromotion.setBackgroundImageURL("https://www.local.sk/documents/2355222/94744940/q3sutaz-NBO_288x202.png");
        abcPromotion.setLogo("https://www.local.sk/documents/2355222/94744940/q3sutaz-NBO_288x202.png");
        abcPromotion.setHeader("Získajte svoj darček od ");
        abcPromotion.setSubHeader("Za návštevu u nás sme si pre vás pripravili malé prekvapenie.");
        abcPromotion.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance.");
        abcPromotion.setText("<h1>My First Heading</h1><p>My first paragraph.</p>");
        abcPromotion.setOfferRestrictedPeriod(123);
        abcPromotion.setOperation("Aktivácia");

        List<PromotionAnswer> abcPromotionAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer3 = new PromotionAnswer();
        promotionAnswer3.setId("Agrees with Offer");
        promotionAnswer3.setPriority(1);
        promotionAnswer3.setDisplayValue("I agree");
        abcPromotionAnswers.add(promotionAnswer3);

        PromotionAnswer promotionAnswer4 = new PromotionAnswer();
        promotionAnswer4.setId("Disagrees with Offer");
        promotionAnswer4.setPriority(3);
        promotionAnswer4.setDisplayValue("No, thanks");
        abcPromotionAnswers.add(promotionAnswer4);

        PromotionAnswer promotionAnswer5 = new PromotionAnswer();
        promotionAnswer5.setId("Defer offer");
        promotionAnswer5.setPriority(2);
        promotionAnswer5.setDisplayValue("Maybe later");
        abcPromotionAnswers.add(promotionAnswer5);

        abcPromotion.setPromotionAnswer(abcPromotionAnswers);

        abcPromotion.setActionDetailLabel("Zobraziť detail");
        abcPromotion.setNboStory("moje/nbo/nbo.json");
        abcPromotion.setPriority(99);
        abcPromotion.setDisplay("TOP");
        abcPromotion.setSource("NBO");
        abcPromotion.setPromoExternalId("XMASS_2022");
        abcPromotion.setPromoGroup("SCRATCH_REGULAR");

        productPromotionList.add(abcPromotion);

        ProductPromotion abc1Promotion = new ProductPromotion();
        abc1Promotion.setPromotionId("abc1");
        abc1Promotion.setLabel("Second promotion");
        abc1Promotion.setActionLabel("Action label 2");
        abc1Promotion.setBackgroundColour("#dc233d");
        abc1Promotion.setBackgroundColourType("BLUE");
        abc1Promotion.setBackgroundImageURL("https://www.local.sk/documents/2355222/94744940/07-47_HW_PHONE_NBO_288x202_1%5B6%5D.png");
        abc1Promotion.setHeader("Some <b>bold header</b> with a text in second line too");
        abc1Promotion.setSubHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's <b>standard dummy text ever since the 1500s</b>, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        abc1Promotion.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance.");
        abc1Promotion.setText("<h1>My First Heading</h1><p>My first paragraph.</p>");
        abc1Promotion.setOfferRestrictedPeriod(123);
        abc1Promotion.setOperation("Zmena");

        List<PromotionAnswer> abc1PromotionAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer6 = new PromotionAnswer();
        promotionAnswer6.setId("Agrees with Offer");
        promotionAnswer6.setPriority(1);
        promotionAnswer6.setDisplayValue("I agree");
        abc1PromotionAnswers.add(promotionAnswer6);

        PromotionAnswer promotionAnswer7 = new PromotionAnswer();
        promotionAnswer7.setId("Disagrees with Offer");
        promotionAnswer7.setPriority(3);
        promotionAnswer7.setDisplayValue("No, thanks");
        abc1PromotionAnswers.add(promotionAnswer7);

        PromotionAnswer promotionAnswer8 = new PromotionAnswer();
        promotionAnswer8.setId("Defer offer");
        promotionAnswer8.setPriority(2);
        promotionAnswer8.setDisplayValue("Maybe later");
        abc1PromotionAnswers.add(promotionAnswer8);
        abc1Promotion.setPromotionAnswer(abc1PromotionAnswers);

        abc1Promotion.setPriority(97);
        abc1Promotion.setSource("NBO");

        productPromotionList.add(abc1Promotion);


        ProductPromotion abc2Promotion = new ProductPromotion();
        abc2Promotion.setPromotionId("abc2");
        abc2Promotion.setLabel("Third");
        abc2Promotion.setActionLabel("Action label 3");
        abc2Promotion.setBackgroundColour("#00b9b5");
        abc2Promotion.setBackgroundColourType("BLACK_TO_BLUE");
        abc2Promotion.setBackgroundImageURL("https://www.local.sk/documents/2355222/94744940/06-51_sablony_NBO_desktop_B_HW-4.png");
        abc2Promotion.setHeader("Some header 3");
        abc2Promotion.setSubHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's <b>standard dummy text ever since the 1500s</b>, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        abc2Promotion.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance.");
        abc2Promotion.setText("<h1>My First Heading</h1><p>My first paragraph.</p>");
        abc2Promotion.setOfferRestrictedPeriod(123);
        abc2Promotion.setActionAcceptURL("https://www.local.sk/ponuka/mobilne-sluzby");

        List<PromotionAnswer> abc2PromotionAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer9 = new PromotionAnswer();
        promotionAnswer9.setId("Agrees with Offer");
        promotionAnswer9.setPriority(1);
        promotionAnswer9.setDisplayValue("I agree");
        abc2PromotionAnswers.add(promotionAnswer9);
        abc2Promotion.setPromotionAnswer(abc2PromotionAnswers);

        abc2Promotion.setPriority(98);
        abc2Promotion.setSource("NBO");

        productPromotionList.add(abc2Promotion);

        ProductPromotion abc3Promotion = new ProductPromotion();
        abc3Promotion.setPromotionId("abc3");
        abc3Promotion.setActionLabel("Action label 4");
        abc3Promotion.setBackgroundColour("#00b9b5");
        abc3Promotion.setBackgroundColourType("WHITE_TO_BLUE");
        abc3Promotion.setBackgroundImageURL("https://www.local.sk/documents/2355222/94744940/06-51_sablony_NBO_desktop_B_HW-4.png");
        abc3Promotion.setHeader("Without label");
        abc3Promotion.setSubHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's <b>standard dummy text ever since the 1500s</b>, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        abc3Promotion.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. Click here for <a href=\"mojesk://deeplink/mcc\"> Spolu</a>");
        abc3Promotion.setText("<h1>My First Heading</h1><p>My first paragraph.</p>");
        abc3Promotion.setOfferRestrictedPeriod(123);
        abc3Promotion.setActionAcceptURL("mojesk://deeplink/mcc");

        List<PromotionAnswer> abc3PromotionAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer10 = new PromotionAnswer();
        promotionAnswer10.setId("Agrees with Offer");
        promotionAnswer10.setPriority(1);
        promotionAnswer10.setDisplayValue("I agree");
        abc3PromotionAnswers.add(promotionAnswer10);
        abc3Promotion.setPromotionAnswer(abc3PromotionAnswers);

        abc3Promotion.setPriority(96);
        abc3Promotion.setSource("NBO");

        productPromotionList.add(abc3Promotion);


        ProductPromotion promoNbo = new ProductPromotion();
        promoNbo.setPromotionId("promoNbo");
        promoNbo.setActionLabel("Promo NBO label");
        promoNbo.setBackgroundColour("#00b9b5");
        promoNbo.setBackgroundColourType("GOLD");
        promoNbo.setBackgroundImageURL("https://www.local.sk/documents/2355222/94744940/06-51_sablony_NBO_desktop_B_HW-4.png");
        promoNbo.setHeader("Promo NBO");
        promoNbo.setSubHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's <b>standard dummy text ever since the 1500s</b>, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        promoNbo.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. Contrary to popular belief, Lorem Ipsum is not simply random text. <b>It has roots in a piece of classical Latin literature from 45 BC,</b> making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. Click here for <a href=\"mojesk://deeplink/mcc\"> Spolu</a>");
        promoNbo.setText("<h1>My First Heading</h1><p>My first paragraph.</p>");
        promoNbo.setOfferRestrictedPeriod(123);

        List<PromotionAnswer> promoNboAnswers = new ArrayList<>();
        PromotionAnswer promotionAnswer11 = new PromotionAnswer();
        promotionAnswer11.setId("Agrees with Offer");
        promotionAnswer11.setPriority(1);
        promotionAnswer11.setDisplayValue("I agree");
        promoNboAnswers.add(promotionAnswer11);

        PromotionAnswer promotionAnswer12 = new PromotionAnswer();
        promotionAnswer12.setId("Disagrees with Offer");
        promotionAnswer12.setPriority(2);
        promotionAnswer12.setDisplayValue("No, thanks");
        promoNboAnswers.add(promotionAnswer12);

        promoNbo.setPromotionAnswer(promoNboAnswers);

        promoNbo.setNboStory("moje/nbo/nbo.json");
        promoNbo.setPriority(100);
        promoNbo.setSource("PCE");
        promoNbo.setPromoExternalId("BLACK_FRIDAY_QR");
        promoNbo.setPromoGroup("GIFT");

        productPromotionList.add(promoNbo);

        productPromotions.setProductPromotion(productPromotionList);
        productPromotionsDTO.setProductPromotions(productPromotions);

        return productPromotionsDTO;
    }

    public RootDTO getAppsSlot(){
        RootDTO rootDTO = new RootDTO();
        List<AppSlotsDTO> appsSlotsDTO = new ArrayList<>();
        AppSlotsDTO appSlotsDTO = new AppSlotsDTO();
        List<AppSlotDTO> appSlotDTOList = new ArrayList<>();
        AppSlotDTO appSlotDTO = new AppSlotDTO();
        appSlotDTO.setProductId("TB1");
        appSlotDTO.setProductName(null);
        appSlotDTO.setType("BASIC");
        appSlotDTO.setAllowedModification("C");
        appSlotDTO.setAssignedAppId(":POP:APP:TIKTOK");
        AppsDTO apps = new AppsDTO();
        List<AppDTO> appDTOList = new ArrayList<>();
        AppDTO appDTO = new AppDTO();
        appDTO.setProductId(":POP:APP:TIKTOK");
        appDTO.setProductName("TIK TOK");
        appDTO.setCategory("Videá");
        appDTO.setStatus("D");
        appDTO.setAllowedModification("A");
        appDTO.setIconURL("{{request.requestLine.host}}:{{request.requestLine.port}}/images/app/tiktok.png");
        appDTO.setDescription("TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momenty zo svojho života.TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momnty zo svojho života.TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momenty zo svojho života.TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momenty zo svojho života.TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momenty zo svojho života.TIK TOK je sociálna sieť zameraná na video obsah, ktorá postupne naberá na popularite po celom svete. Ponúkne vám množstvo zábavných či nevšedných videí od ostatných užívateľov, ktorí sa chcú podeliť o zaujímavé momenty zo svojho života.");
        appDTO.setActiveTo(null);
        appDTO.setInstanceId(null);
        appDTO.setProductGroup("L");
        appDTOList.add(appDTO);
        appDTOList.add(appDTO);
        appDTOList.add(appDTO);
        appDTOList.add(appDTO);
        appDTOList.add(appDTO);
        appDTOList.add(appDTO);


        apps.setApp(appDTOList);
        appsSlotsDTO.add(appSlotsDTO);
        appsSlotsDTO.add(appSlotsDTO);
        appsSlotsDTO.add(appSlotsDTO);
        appsSlotsDTO.add(appSlotsDTO);



        appSlotDTO.setApps(apps);
        appSlotDTOList.add(appSlotDTO);
        appSlotsDTO.setAppSlot(appSlotDTOList);
        rootDTO.setAppSlots(appsSlotsDTO);

        return rootDTO;
    }

    public SubComplexDTO getSubComplex(){
        SubComplexDTO subComplexDTO = new SubComplexDTO();
        SubscriberComplexDTO subscriberComplexDTO = new SubscriberComplexDTO();

        subscriberComplexDTO.setSubscriber(getSubscriberDTO());
        subscriberComplexDTO.setApprovals(getApprovalsDto());
        subscriberComplexDTO.setServicesAndUsages(getServicesAndUsagesDTO());
        subscriberComplexDTO.setAppSlots(getAppsSlot());
        subscriberComplexDTO.setBonusSlots(getBonusSlotsDTO());
        subscriberComplexDTO.setSsoAccount(getSsoAccount());
        subscriberComplexDTO.setProductPromotions(getProductPromotions());


        subComplexDTO.setSubscriberComplex(subscriberComplexDTO);
        return subComplexDTO;
    }


}
