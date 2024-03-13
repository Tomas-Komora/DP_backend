package com.example.SpringBootDP.DTO.subscriber;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Data
public class SubscriberDTO {
    private String scratchDay;
    private boolean eligibleForApp;
    private String subscriberType;
    private long subscriberId;
    private long msisdn;
    private String assetLastUpdatedAt;
    private List<TariffDTO> tariffs;
    private String activationDate;
    private String status;
    private String statusDate;
    private String statusReason;
    private long BACuRefNo;
    private String BAName;
    private String BPFirstName;
    private long BPCuRefNo;
    private boolean isBusinessSegment;
    private boolean selfServiceManagement;
    private LocalDate startOfBC;
    private LocalDate endOfBC;
    private int daysTillEndOfBC;
    private String billCycleId;
    private boolean isChangedTariffInCurrentBc;
    private String billMediaType;
    private EmailDTO email;
    private SettingsDTO settings;
    private String hasMoreSubscribers;
    private String hasMoreBillingArrangements;
}




