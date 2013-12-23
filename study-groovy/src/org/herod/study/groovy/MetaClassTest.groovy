package org.herod.study.groovy

import static org.junit.Assert.*;

import org.junit.Test;

class MetaClassTest {

	@Test
	void testName() {
		String.metaClass.'static'.hi = {
			println 'hi ' + delegate
		}
		'aaa'.hi()	
		String.hi();
	}
}
