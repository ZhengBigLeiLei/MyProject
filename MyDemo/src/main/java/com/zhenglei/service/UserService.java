package com.zhenglei.service;

import com.zhenglei.dao.User;

public class UserService {

	public static void main(String[] args) {
	
		User user = new User();
		user.setName("张三");
		user.setAge(18L);
		System.out.println(user.toString());
	}
}
