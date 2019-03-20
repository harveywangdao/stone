package com.chain.service01.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PeopleMapper {
	@Insert("INSERT INTO people(name,age,sex) VALUES(#{name}, #{age}, #{sex})")
	int insert(@Param("name") String name, @Param("age") Integer age, @Param("sex") String sex);
}
