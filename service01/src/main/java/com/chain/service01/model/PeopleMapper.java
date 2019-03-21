package com.chain.service01.model;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PeopleMapper {
	@Insert("INSERT INTO people(name,age,sex,create_time) VALUES(#{name}, #{age}, #{sex}, #{createTime})")
	int insert(@Param("name") String name, @Param("age") Integer age, @Param("sex") String sex, @Param("createTime") Date createTime);
}
