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
class SwitchTest extends GroovyTestCase {

	void testSwitch() {
		switch ("zhangsan") {
			case new User(name:"zhangsan") :
				break;
			default :
				fail('test switch failed.');
		}
	}

	class User {
		String name;
		
		boolean isCase(s) {
			s == name;
		}
	}
}
