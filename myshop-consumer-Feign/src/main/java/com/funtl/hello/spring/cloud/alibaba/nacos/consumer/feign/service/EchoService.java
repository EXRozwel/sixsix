package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;




@FeignClient(value = "nacos-provider")
public interface EchoService {






    @GetMapping(value = "/echo/{message}")
   public String echo(@PathVariable("message") String message);



}
