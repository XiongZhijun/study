/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import org.codehaus.groovy.runtime.GStringImpl

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class StringTest extends GroovyTestCase {

	void testDefString() {
		def o = "abc";
		assertEquals(String, o.class);
		o = 'abc';
		assertEquals(String, o.class);
		o = "abc${o}";
		assertEquals(GStringImpl, o.class);
		assertTrue(o instanceof GString);
		o = """hello""";
		assertEquals(String, o.class);
	}

	void testGetAt() {
		def o = "hello world";
		assertEquals('h', o[0]);
		assertEquals('h', o.getAt(0));
		assertEquals('hell', o[0..3]);
		assertEquals('hel', o[0..<3]);
		assertEquals('lle', o[3..1]);
		assertEquals(String, o[3..1].class);
		assertEquals('elo', o[1, 3, 4]);
		assertEquals('hello', o - ' world');
	}

	void testLeftShiftOperator() {
		def o = "hello world";
		assertFalse((o + "!") == (o << "!"));
		assertEquals(String, (o + "!").class)
		assertEquals(StringBuffer, (o << "!").class)
	}
}
