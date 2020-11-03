package com.daling.consumer.service.impl;

import com.daling.consumer.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements IDemoService {

    @Override
    public String getName() {
        return "demo";
    }
}