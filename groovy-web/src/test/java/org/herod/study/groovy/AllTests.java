/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy;

import java.lang.reflect.Method;

import groovy.util.GroovyTestSuite;
import junit.framework.TestSuite;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class AllTests extends TestSuite {
	private static final String TEST_ROOT = "src/test/java/org/herod/study/groovy/";

	public static TestSuite suite() throws Exception {
		TestSuite suite = new TestSuite();
		GroovyTestSuite gsuite = new GroovyTestSuite();
		Class<?> clazz = gsuite.compile(TEST_ROOT + "TestClassesLoader.groovy");
		Object loader = clazz.newInstance();
		Method method = clazz.getMethod("loadAllGroovyTests", new Class<?>[] {
				TestSuite.class, GroovyTestSuite.class, String.class });
		method.invoke(loader, suite, gsuite, TEST_ROOT);
		return suite;
	}
}
