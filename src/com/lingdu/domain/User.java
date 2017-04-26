package com.lingdu.domain;

import com.sun.istack.internal.NotNull;

public class User {
	
	private String name;
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
