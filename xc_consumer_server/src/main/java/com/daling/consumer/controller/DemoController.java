package com.daling.consumer.controller;

import com.daling.consumer.service.IDemoService;
import com.daling.producer.api.InnerDemoApi;
import com.daling.producer.dto.DemoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private IDemoService demoService;

    @Resource
    private InnerDemoApi innerDemoApi;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        log.info("demo test log");
        log.info(demoService.getName());
        List<DemoDto> demoDtos = innerDemoApi.queryDemoDtoList();
        System.out.println("test----" + demoDtos.get(0).getName());
        return "demo";
    }
}