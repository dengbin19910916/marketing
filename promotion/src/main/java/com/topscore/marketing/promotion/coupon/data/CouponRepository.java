package com.topscore.marketing.promotion.coupon.data;

import com.topscore.marketing.api.promotion.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, String> {

    List<Coupon> findByGrantType(String grantType);
}
