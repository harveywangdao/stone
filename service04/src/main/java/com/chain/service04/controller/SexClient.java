package com.chain.service04.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-service03")
public interface SexClient {
	@PostMapping("/sex/addSex")
	String addSex(@RequestParam("id") Long id, @RequestParam("sex") String sex);
	
	@GetMapping("/sex/{id}")
	String getSex(@PathVariable("id") Long id);
}
