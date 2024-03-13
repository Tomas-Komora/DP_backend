package com.example.SpringBootDP.DTO.approvals;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class Approvals {
    private List<Approval> approval;
}
