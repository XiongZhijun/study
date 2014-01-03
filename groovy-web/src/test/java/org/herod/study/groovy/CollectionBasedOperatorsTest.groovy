/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import java.io.IOException;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class CollectionBasedOperatorsTest extends GroovyTestCase {

	void testBaseSpreadOperator() {
		def c = [1, 3, 5,];
		assertEquals([Integer, Integer, Integer], c*.class);
	}

	void testActionSpreadOperator() {
		StringBuffer buffer = new StringBuffer();
		def tmpOut = System.out;
		System.out = new PrintStream(new StringBufferOutputStream(buffer));
		def users = [
			new User(name:'zhangsan'),
			new User(name:'lisi'),
			new User()
		];
		assertEquals([null, null, null], users*.sayHello());
		assertEquals("hello, zhangsan.hello, lisi.hi.", buffer.toString());

		assertEquals(['zhangsan', 'lisi', null],users.collect { it.name });
		System.out = tmpOut;
	}

	class User {
		String name;
		def sayHello() {
			if (name != null) {
				print "hello, ${name}.";
			} else {
				print "hi.";
			}
		}
	}
}
