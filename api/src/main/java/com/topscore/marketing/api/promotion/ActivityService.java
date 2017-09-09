package com.topscore.marketing.api.promotion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mgmt")
public interface ActivityService {

    @GetMapping("/activity/{number}")
    Activity getActivity(@PathVariable String number);

    @GetMapping("/shop/{number}")
    Shop getShop(@PathVariable String number);

    @GetMapping("/name")
    String getName();
}
