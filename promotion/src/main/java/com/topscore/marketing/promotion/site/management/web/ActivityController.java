package com.topscore.marketing.promotion.site.management.web;

import com.topscore.marketing.api.promotion.Activity;
import com.topscore.marketing.api.promotion.ActivityService;
import com.topscore.marketing.api.promotion.Shop;
import com.topscore.marketing.promotion.site.management.data.ActivityRepository;
import com.topscore.marketing.promotion.site.management.data.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController implements ActivityService {

    private final ActivityRepository activityRepository;

    private final ShopRepository shopRepository;

    @Autowired
    public ActivityController(ActivityRepository activityRepository, ShopRepository shopRepository) {
        this.activityRepository = activityRepository;
        this.shopRepository = shopRepository;
    }

    @Override
    public Activity getActivity(@PathVariable String number) {
        return activityRepository.findByNumber(number).toDto();
    }

    @Override
    public Shop getShop(@PathVariable String number) {
        return shopRepository.findByNumber(number).toDto();
    }

    @GetMapping("/name")
    public String getName() {
        return "dengb";
    }
}
