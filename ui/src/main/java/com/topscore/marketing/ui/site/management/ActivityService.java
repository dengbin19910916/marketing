package com.topscore.marketing.ui.site.management;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("promotion")
@RequestMapping("/mgmt")
public interface ActivityService {

    @GetMapping("/name")
    String getName();

}
