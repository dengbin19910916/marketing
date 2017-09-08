package com.topscore.marketing.api.promotion;

import lombok.Data;

/**
 * 促销活动对象。
 *
 * @author dengb
 */
@Data
public class Activity {

    /**
     * 主键
     */
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
