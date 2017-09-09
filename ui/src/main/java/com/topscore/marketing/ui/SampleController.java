package com.topscore.marketing.ui;

import com.topscore.marketing.ui.site.management.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    private final ActivityService activityService;

    @Autowired
    public SampleController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/hello")
    public String hello() {
        return activityService.getName();
    }
}
