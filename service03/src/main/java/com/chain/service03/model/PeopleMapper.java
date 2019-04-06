package com.chain.service03.model;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PeopleMapper {
	@Insert("INSERT INTO people(name,age,sex,create_time) VALUES(#{name}, #{age}, #{sex}, #{createTime})")
	int insert(@Param("name") String name, @Param("age") Integer age, @Param("sex") String sex, @Param("createTime") Date createTime);
	
	@Update("UPDATE people SET name=#{name} WHERE id=#{id}")
	int insertName(@Param("id") Long id, @Param("name") String name);
	
	@Select("SELECT name FROM people WHERE id=#{id}")
	String getName(@Param("id") Long id);
	
	@Update("UPDATE people SET sex=#{sex} WHERE id=#{id}")
	int insertSex(@Param("id") Long id, @Param("sex") String sex);
	
	@Select("SELECT sex FROM people WHERE id=#{id}")
	String getSex(@Param("id") Long id);
}
