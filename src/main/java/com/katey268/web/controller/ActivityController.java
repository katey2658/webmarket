package com.katey268.web.controller;

import com.katey268.web.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 11456 on 2017/1/2.
 */

@Controller
@RequestMapping("/activity")
public class ActivityController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ActivityService activityService;

}
