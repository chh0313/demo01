package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.graykey.ssm.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:applicationContext.xml"})  
public class SpringTest {
	
		@Resource(name="userServiceImp")  
	    private IUserService userService; 
		
	    @Test   
	    public void testServie(){  
	    	try {
				userService.add();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    @Test   
	    public void testServie2(){  
	    	try {
	    		userService.add2(1);
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	
}
