package com.chain.service02.model;

import java.util.Date;

/*
DROP TABLE IF EXISTS `people`;

CREATE TABLE `people`(
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `name` varchar(200) NULL DEFAULT NULL,
   `age` int(11) NULL DEFAULT NULL,
   `sex` varchar(10) NULL DEFAULT NULL,
   `create_time` datetime(0) NOT NULL,
   PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

*/

public class PeopleModel {
	private Long id;
	private String name;
	private Integer age;
	private String sex;
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
