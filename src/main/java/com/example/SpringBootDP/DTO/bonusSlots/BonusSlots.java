package com.example.SpringBootDP.DTO.bonusSlots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class BonusSlots {
    private List<BonusSlot> bonusSlot;
}
