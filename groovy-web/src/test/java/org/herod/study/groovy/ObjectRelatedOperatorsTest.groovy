/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import groovy.util.GroovyTestCase

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class ObjectRelatedOperatorsTest extends GroovyTestCase {

	void testJavaField() {
		User user = new User(name : 'zhangsan');
		assertEquals("hi, zhangsan", user.name);
		assertEquals("zhangsan", user.@name);
	}

	class User {
		def name;

		def getName() {
			return "hi, " + name;
		}
	}
}
