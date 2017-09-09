package com.topscore.marketing.promotion.site.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Shop implements Dao<com.topscore.marketing.api.promotion.Shop> {

    @Id
    private String id;

    private String name;

    private String number;

    @Override
    public com.topscore.marketing.api.promotion.Shop toDto() {
        com.topscore.marketing.api.promotion.Shop shop = new com.topscore.marketing.api.promotion.Shop();
        BeanUtils.copyProperties(this, shop);
        return shop;
    }
}
