/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class OperatorTest extends GroovyTestCase {

	@Test
	void testModel() {
		assertEquals(2, 5%3)
	}

	@Test
	void testModelWithError() {
		shouldFail (UnsupportedOperationException) { def model = 5%3.0 }
	}
}
