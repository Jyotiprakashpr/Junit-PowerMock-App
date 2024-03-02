package com.ashokIt.service;

import com.ashokIt.dao.UserDao;

public class UserService {
	
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
   public String getName(Integer id) {
	   String name = userDao.findNameById(id);
	   return name;
	   
   }
}
