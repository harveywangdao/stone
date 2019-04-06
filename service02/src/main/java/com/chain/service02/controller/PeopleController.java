package com.chain.service02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service02.model.PeopleMapper;

@RestController
@RequestMapping("/age")
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@PostMapping("/addAge")
	public String addAge(@RequestParam("id") Long id, 
			              @RequestParam("age") Integer age) {
		peopleMapper.insertAge(id, age);
		return "success";
	}
	
	@GetMapping("/{id}")
	public Integer getAge(@PathVariable("id") Long id) {
		return peopleMapper.getAge(id);
	}
}
