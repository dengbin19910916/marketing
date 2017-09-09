package com.topscore.marketing.promotion.site.management.data;

import com.topscore.marketing.promotion.site.management.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, String> {

    Shop findByNumber(String number);
}
