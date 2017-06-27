package com.graykey.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graykey.ssm.dao.IUserDao;
import com.graykey.ssm.model.User;

@Transactional(rollbackFor=java.lang.Exception.class)		//不加该注解，事务不会回滚
@Service(value="userServiceImp")
public class UserServiceImp implements IUserService {

	@Resource(name="userDaoImp")
	private IUserDao userDao;
		
	public void add() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("admin");
		userDao.add(user);
	}
	
	public void add2(int i) {
		User user = new User();
		user.setUserId(1);
		user.setUserName("admin");
		userDao.add(user);
		
		if(i == 1){
			throw new RuntimeException("我是异常");
		}
		
		User user2 = new User();
		user2.setUserId(2);
		user2.setUserName("admin2");
		userDao.add(user2);
	}
}
