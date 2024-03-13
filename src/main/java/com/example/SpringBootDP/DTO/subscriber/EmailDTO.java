package com.example.SpringBootDP.DTO.subscriber;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EmailDTO {
    private String eInvoiceEmail;
    private String BPEmail;
    private String zekVerificationStatus;
}