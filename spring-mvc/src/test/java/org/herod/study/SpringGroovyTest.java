/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
@ContextConfiguration
public class SpringGroovyTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void test() throws InterruptedException {
		UserService userService = applicationContext.getBean(UserService.class);
		assertEquals(35, userService.getUserAge("zhangsan"));
	}

	public static interface UserService {
		int getUserAge(String userName);
	}
}
