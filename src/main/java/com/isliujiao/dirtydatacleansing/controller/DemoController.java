package com.isliujiao.dirtydatacleansing.controller;

import com.isliujiao.dirtydatacleansing.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author liujiao
 * @date 2023/7/20 16:27
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService helloService;

}
