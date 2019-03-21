package com.chain.service01.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chain.service01.model.PeopleMapper;

@RestController
public class PeopleController {
	@Autowired
	private PeopleMapper peopleMapper;
	
	@PostMapping("addName")
	public void addName() {
		peopleMapper.insert("xiaoming", 15, "boy", new Date());
	}
}
