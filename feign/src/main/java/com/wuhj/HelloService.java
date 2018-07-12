package com.wuhj;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by a123456 on 2018/7/11.
 */
@FeignClient(value = "service-hi-8082", fallback = HelloErrorService.class)
public interface HelloService {

     @GetMapping(value = "/hi")
     String sayHi(@RequestParam("name") String name);
}
