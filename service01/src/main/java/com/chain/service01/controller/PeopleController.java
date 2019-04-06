package com.chain.service01.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service01.model.PeopleMapper;
import com.chain.service01.model.PeopleModel;

@RestController
@RequestMapping("/name")
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@PostMapping("/addPeople")
	public String addPeople(@ModelAttribute PeopleModel p) {
		Date nowTime = new Date();
		peopleMapper.insert(p.getName(), p.getAge(), p.getSex(), nowTime);
		return "success";
	}
	
	@PostMapping("/addPeople2")
	public String addPeople2(@RequestBody PeopleModel p) {
		Date nowTime = new Date();
		peopleMapper.insert(p.getName(), p.getAge(), p.getSex(), nowTime);
		return "success";
	}
	
	@PostMapping("/addName")
	public String addName(@RequestParam("id") Long id, 
			              @RequestParam("name") String name) {
		peopleMapper.insertName(id, name);
		return "success";
	}
	
	@GetMapping("/{id}")
	public String getName(@PathVariable("id") Long id) {
		return peopleMapper.getName(id);
	}
}
