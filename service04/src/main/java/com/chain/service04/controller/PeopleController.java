package com.chain.service04.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service04.model.PeopleMapper;
import com.chain.service04.model.PeopleModel;

@RestController
@RequestMapping("/people")
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@Autowired
	private NameClient nameClient;
	
	@Autowired
	private AgeClient ageClient;
	
	@Autowired
	private SexClient sexClient;
	
	@PostMapping("/addPeople2")
	public String addPeople2(@RequestBody PeopleModel p) {
		Date nowTime = new Date();
		p.setCreateTime(nowTime);
		peopleMapper.insert(p);
		return "success";
	}
	
	@PostMapping("/addPeople")
	public String addPeople(@ModelAttribute PeopleModel p) {
		Date nowTime = new Date();
		PeopleModel peo = new PeopleModel();
		peo.setCreateTime(nowTime);
		peopleMapper.insert(peo);
		
		Long id = peo.getId();
		System.out.println("id = "+id);
		
		nameClient.addName(id, p.getName());
		ageClient.addAge(id, p.getAge());
		sexClient.addSex(id, p.getSex());
		
		return "success";
	}

}
