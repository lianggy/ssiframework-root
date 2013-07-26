package com.shine.ssi.core.service;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shine.ssi.model.UserPO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-service.xml"})
public class UserManageServiceTest {
	
	@Autowired
	private UserManageService userManageService;
	
	@Test
	public void testFindById(){
		String id = "1";
		UserPO user = userManageService.findById(id);
		Assert.assertNotNull(user);
		Assert.assertEquals("admin", user.getUserName());
	}
	
	@Test
	public void testQueryCount(){
		int result = userManageService.queryCount();
		Assert.assertTrue(result > 0);
	}
}
