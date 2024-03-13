package com.example.SpringBootDP.DTO.approvals;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Approval {
    private String name;
    private boolean approved;
    private String validFrom;
    private Boolean isApprovalSettable;
    private String approvalCheckboxName; // Optional
    private CommunicationChannels communicationChannels;
}
