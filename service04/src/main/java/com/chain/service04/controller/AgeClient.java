package com.chain.service04.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-service02")
public interface AgeClient {
	@PostMapping("/age/addAge")
	String addAge(@RequestParam("id") Long id, @RequestParam("age") Integer age);
	
	@GetMapping("/age/{id}")
    Integer getAge(@PathVariable("id") Long id);
}
