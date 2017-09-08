package com.topscore.marketing.promotion.coupon;

import com.topscore.marketing.api.promotion.Activity;
import com.topscore.marketing.api.promotion.Coupon;
import com.topscore.marketing.api.promotion.CouponService;
import com.topscore.marketing.promotion.coupon.data.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CouponController implements CouponService {

    private final CouponRepository repository;

    @Autowired
    public CouponController(CouponRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Coupon> getCoupons(Activity activity) {
        return repository.findByGrantType(activity.getName());
    }
}
