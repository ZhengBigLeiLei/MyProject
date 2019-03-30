package com.zhenglei.dao;

import lombok.Data;

/**
 * @ClassName:  Student   
 * @Description:TODO
 * @author: Regan
 * @date:   2019年3月29日 下午10:21:12
 */


@Data
public class Student {

	private String studentName;
	private Long age;
	/**
	 * @Title: eat   
	 * @Description: TODO
	 * @param: @param name      
	 * @return: void      
	 * @throws
	 */
	public void eat(String name) {
		System.out.println("吃食物");
		
	}
}
