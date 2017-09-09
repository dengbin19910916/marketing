package com.topscore.marketing.promotion.site.management.web;

import com.topscore.marketing.promotion.site.management.data.ActivityRepository;
import com.topscore.marketing.promotion.site.management.data.ShopRepository;
import com.topscore.marketing.promotion.site.management.model.Activity;
import com.topscore.marketing.promotion.site.management.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mgmt")
public class ActivityController {

    private final ActivityRepository activityRepository;

    private final ShopRepository shopRepository;

    @Autowired
    public ActivityController(ActivityRepository activityRepository, ShopRepository shopRepository) {
        this.activityRepository = activityRepository;
        this.shopRepository = shopRepository;
    }

    @GetMapping("/activity/{number}")
    public Activity getActivity(@PathVariable String number) {
        return activityRepository.findByNumber(number);
    }

    @GetMapping("/shop/{number}")
    public Shop getShop(@PathVariable String number) {
        return shopRepository.findByNumber(number);
    }
}
