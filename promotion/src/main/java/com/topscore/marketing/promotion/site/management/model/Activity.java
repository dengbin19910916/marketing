package com.topscore.marketing.promotion.site.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 促销活动对象。
 *
 * @author dengb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Activity implements Dao<com.topscore.marketing.api.promotion.Activity> {

    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动编号
     */
    private String number;

    @Override
    public com.topscore.marketing.api.promotion.Activity toDto() {
        com.topscore.marketing.api.promotion.Activity activity = new com.topscore.marketing.api.promotion.Activity();
        BeanUtils.copyProperties(this, activity);
        return activity;
    }
}
