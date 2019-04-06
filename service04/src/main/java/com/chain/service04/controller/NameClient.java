package com.chain.service04.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-service01")
public interface NameClient {
	@PostMapping("/name/addName")
    String addName(@RequestParam("id") Long id, @RequestParam("name") String name);
	
	@GetMapping("/name/{id}")
	String getName(@PathVariable("id") Long id);

}
