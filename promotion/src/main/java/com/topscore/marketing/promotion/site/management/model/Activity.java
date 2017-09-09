package com.topscore.marketing.promotion.site.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Activity {

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
}
