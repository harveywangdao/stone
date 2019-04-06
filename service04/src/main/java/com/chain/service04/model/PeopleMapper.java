package com.chain.service04.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface PeopleMapper {
	@Insert("INSERT INTO people(name,age,sex,create_time) VALUES(#{name}, #{age}, #{sex}, #{createTime})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	int insert(PeopleModel p);
	
}
