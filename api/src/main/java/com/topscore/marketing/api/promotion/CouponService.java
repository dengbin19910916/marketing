package com.topscore.marketing.api.promotion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/coupon")
public interface CouponService {

    @GetMapping("/")
    List<Coupon> getCoupons(Activity activity);
}
