package com.example.shell.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api", url = "https://localhost:9000")
public interface TestApi {
    @RequestMapping(method = RequestMethod.POST)
    String doCall(String message);
}
