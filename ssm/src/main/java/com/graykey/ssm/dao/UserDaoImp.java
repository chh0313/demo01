package com.graykey.ssm.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.graykey.ssm.model.User;

@Repository(value="userDaoImp")
public class UserDaoImp implements IUserDao{
	
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	private String name = "com.graykey.ssm.dao.IUserDao";
	
	public void add(User user) {
		
		/*SqlSession s = sqlSessionFactory.openSession();
		s.insert(name+".add",user);*/
		
		sqlSessionTemplate.insert(name+".add",user);
	}

}
