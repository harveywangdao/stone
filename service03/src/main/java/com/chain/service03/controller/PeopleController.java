package com.chain.service03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service03.model.PeopleMapper;

@RestController
@RequestMapping("/sex")
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@PostMapping("/addSex")
	public String addSex(@RequestParam("id") Long id, 
			              @RequestParam("sex") String sex) {
		peopleMapper.insertSex(id, sex);
		return "success";
	}
	
	@GetMapping("/{id}")
	public String getSex(@PathVariable("id") Long id) {
		return peopleMapper.getSex(id);
	}
}
