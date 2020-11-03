package com.daling.consumer.api;

import com.daling.consumer.dto.DemoDto;
import com.daling.consumer.fallback.InnerDemoApiFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "xcconsumer", path = "/xc_consumer/inner/demo", fallback = InnerDemoApiFallbackFactory.class)
public interface InnerDemoApi {

    @RequestMapping(value = "queryDemoDtoList.do")
    List<DemoDto> queryDemoDtoList();
}