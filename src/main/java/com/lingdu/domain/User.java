package com.lingdu.domain;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {
	@NotNull(message="帐号不允许为空！")
	private String name;
	//@DecimalMin(value="20")  //被注释的元素必须是一个数字，其值必须大于等于指定的最小值
	@Max(value=6)
	@Min(value=1)
	@NotNull(message="id不能为空！")
	private String id;
	private String sex;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex + "]";
	}
	
}
