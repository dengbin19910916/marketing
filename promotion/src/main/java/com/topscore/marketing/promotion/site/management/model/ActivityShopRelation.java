package com.topscore.marketing.promotion.site.management.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ActivityShopRelation {

    @Id
    private String id;

    private String activityId;

    private String shopId;
}
