/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import static org.junit.Assert.*;

import org.junit.Test;

import groovy.util.GroovyTestCase

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class ClosureTest extends GroovyTestCase {

	void testClosure() {
		def c = { a,b-> println a; }
		c('123','234');
	}

	void testFind() {
		assertEquals(20, [1, 3, 4, 5, 19, 20, 30].find { it > 19 });
		assertEquals([19, 20, 30], [1, 3, 4, 5, 19, 20, 30].findAll { it > 9 });
	}

	void testAny() {
		assertFalse([].any())
		assertTrue([1].any())
		assertTrue([1, 3, 5].any({ it > 3 }))
		assertFalse([1, 3, 5].any({ it > 5 }))
	}

	void testEvery() {
		assertTrue([].every());
		assertTrue([1].every());
		assertTrue([1, 2, 3].every({ it < 5 }));
		assertFalse([1, 2, 3].every({ it < 2 }));
	}

	void testCollect() {
		assertEquals([1, 2, 3, 4], [1, 2, 3, 4].collect());
		assertEquals([2, 4, 6, 8], [1, 2, 3, 4].collect{it * 2});
	}

	void testInject() {
		assertEquals(120, [1, 2, 3, 4, 5].inject { p, e ->
			p * e
		});
		assertEquals(1200, [1, 2, 3, 4, 5].inject(10) { p, e ->
			p * e
		});
	}
}
