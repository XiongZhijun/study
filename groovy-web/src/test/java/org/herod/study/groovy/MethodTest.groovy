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
class MethodTest extends GroovyTestCase {

	void testMethod() {
		assertEquals("1-2-3", method1(1, 2, 3));
		assertEquals("1-2-100", method1(1, 2));
		assertEquals("[a:1, b:2]_50", method2(a:1, b:2, 50));
		shouldFail(MissingMethodException) {
			assertEquals("[a:1, b:2]_50", method2(50));
		}
		assertEquals("50_[d:10, a:1, b:2]", method3(d:10, 50, a:1, b:2));
	}

	def method1(p1, p2, p3=100) {
		"${p1}-${p2}-${p3}"
	}

	def method2(map, c) {
		map.toString() + "_" + c.toString()
	}

	def method3(c, map) {
		assertFalse(map instanceof Map);
		assertTrue(c instanceof Map);
		map.toString() + "_" + c.toString()
	}
}
