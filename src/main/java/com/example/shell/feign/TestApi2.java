package com.example.shell.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api2", url = "https://localhost:9001")
public interface TestApi2 {
    @RequestMapping(method = RequestMethod.POST)
    String doCall(String message);
}
