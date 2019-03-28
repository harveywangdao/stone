package com.chain.service01.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service01.model.PeopleMapper;
import com.chain.service01.model.PeopleModel;

@RestController
@RequestMapping(value="people")
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@PostMapping("addName")
	public void addName() {
		
	}
	
	@PostMapping("addPeople")
	public String addPeople(@ModelAttribute PeopleModel p) {
		peopleMapper.insert(p.getName(), p.getAge(), p.getSex(), new Date());
		return "success";
	}
}
