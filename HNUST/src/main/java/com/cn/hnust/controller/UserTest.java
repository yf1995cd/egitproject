package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.junit.Test;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;


public class UserTest {
	@Resource(name = "UserServiceImpl2")
	private IUserService userService;
	
	@Test
	public void name() {
		System.out.println("test");
		userService.getUserById(1);
	}

}
