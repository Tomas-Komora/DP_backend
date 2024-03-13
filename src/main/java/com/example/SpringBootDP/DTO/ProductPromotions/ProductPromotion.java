package com.example.SpringBootDP.DTO.ProductPromotions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ProductPromotion {
    private String promotionId;
    private Integer priority;
    private String text;
    private String content;
    private String header;
    private String subHeader;
    private String label;
    private String startDate;
    private String endDate;
    private String backgroundColourType;
    private String operation;
    private List<PromotionAnswer> promotionAnswer;
    private String actionAcceptURL;
    private String display;
    private String source;
    private String promoGroup;
    private String promoExternalId;
    private String nboStory;
    private String actionLabel;
    private String backgroundColour;
    private String backgroundImageURL;
    private String logo;
    private Integer offerRestrictedPeriod;
    private String actionDetailLabel;

}
