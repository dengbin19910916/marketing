package com.topscore.marketing.promotion.site.management.data;

import com.topscore.marketing.promotion.site.management.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, String> {

    Activity findByNumber(String number);
}
