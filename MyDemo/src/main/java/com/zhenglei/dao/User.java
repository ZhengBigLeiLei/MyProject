package com.zhenglei.dao;

/**
 * 
 * @author Regan
 *
 */
public class User {
	private String name;
	private Long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	public User(String name, Long age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
	}

}
