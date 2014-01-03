/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import org.codehaus.groovy.runtime.GStringImpl;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class ObjectTest extends GroovyTestCase {

	void testNewObject() {
		def o = 12;
		assertEquals(Integer, o.class);
		o = 'abc';
		assertEquals(String, o.class);
		o = "abc";
		assertEquals(String, o.class);
		o = "abc${o}";
		assertEquals(GStringImpl, o.class);
		assertTrue(o instanceof GString);
		o = """hello""";
		assertEquals(String, o.class);
	}
	
	void testRange() {
		assertEquals(IntRange, (1..2).class);
		assertTrue((1..2) instanceof Range);
	}
}
