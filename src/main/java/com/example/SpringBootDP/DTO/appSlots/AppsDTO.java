package com.example.SpringBootDP.DTO.appSlots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class AppsDTO {
    private List<AppDTO> app;
}
