package com.topscore.marketing.api.promotion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 赠品。
 * @author dengb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gift {

    /**
     * 主键
     */
    private String id;

    /**
     * 赠品名称
     */
    private String name;

    /**
     * 赠品编号
     */
    private String number;
}
