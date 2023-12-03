package com.isliujiao.dirtydatacleansing.service.impl;

import com.isliujiao.dirtydatacleansing.mapper.DemoMapper;
import com.isliujiao.dirtydatacleansing.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujiao
 * @date 2023/7/17 9:52
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

}
