/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import groovy.util.GroovyTestCase

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class RegularExpressionTest extends GroovyTestCase {

	void testDefine(){
		def p = ~/hello/;
		assertEquals(Pattern, p.class);
		assertFalse(p.matcher("hello world").matches());
		assertTrue(p.matcher("hello").matches());
	}

	void testCreateMatcher() {
		def result = "hello world" =~ "(he)ll(.)";
		assert result.find();
		assertEquals(['hello', 'he', 'o'], result[0]);
		assert "hello world" =~ "hello";
		assertEquals(Matcher, ("hello world" =~ "hello").class);
		assert !("hell1 world" =~ "hello");
		assertEquals(Matcher, ("hell1 world" =~ "hello").class);
	}

	void testMatch() {
		assertTrue("hello" ==~ "hell.");
		assertTrue("hello world" ==~ "hell.*");
		assertTrue("hello world" ==~ "hell. .{5}");
	}

	void testReplace() {
		def m = "hello world" =~ /hello/;
		assertEquals("fuck world", m.replaceAll("fuck"));
		assertEquals("fuck fuck", "hello world".replaceAll("\\w{5}", "fuck"));
		assertEquals("fuck world", "hello world".replaceAll(/^\w{5}/, "fuck"));
		m = "hello world" =~ /\w{5}/
		m.each { println it }
		assertEquals("Hello World", "hello world".replaceAll (/\w{5}/) {
			it[0].toUpperCase() + ((it.size() > 1) ? it[1..-1] : '');
		});
	}
	
	void testBackreferences() {
		assertEquals("ac", "abc".replaceAll(/(a)(b)(c)/, '$1$3'));
	}
}
