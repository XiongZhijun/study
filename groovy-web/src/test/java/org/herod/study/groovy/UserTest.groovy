/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class UserTest extends GroovyTestCase {

	@Test
	public void testUser() {
		User user = new User();
		user.setName("zhangsan");
		user.setAge(20);
		assertEquals("zhangsan",user.name);
		assertEquals(20,user.getAge());
	}

	@Test
	void testPrivateField() {
		User user = new User();
		assertNotNull(user.createDate);
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 2);
		user.createDate = calendar.time;
		assertEquals("2000-02-02", user.createDate.format("yyyy-MM-dd"));
	}
}
