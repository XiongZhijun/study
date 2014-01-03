/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy;

import groovy.util.GroovyTestSuite;
import junit.framework.TestSuite;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class AllTests extends TestSuite {
	private static final String TEST_ROOT = "src/test/java/org/herod/study/groovy/";

	@SuppressWarnings("unchecked")
	public static TestSuite suite() throws Exception {
		TestSuite suite = new TestSuite();
		GroovyTestSuite gsuite = new GroovyTestSuite();
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "UserTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "GroovyMarkupTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "OperatorTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "ObjectTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "StringTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "CollectionBasedOperatorsTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "ObjectRelatedOperatorsTest.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "SwitchTest.groovy"));
		return suite;
	}
}
