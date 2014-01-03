/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import junit.framework.TestSuite;
import groovy.lang.GroovyClassLoader;
import groovy.util.GroovyTestSuite;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class TestClassesLoader {

	def loadAllGroovyTests(TestSuite suite, GroovyTestSuite gsuite, String rootDir) {
		new File(rootDir).listFiles({ d, f ->
			f ==~ /.+Test\.groovy/          // 获取所以符合要求的测试文件
		} as FilenameFilter).collect { file ->
			gsuite.compile(file.absolutePath) // 将Groovy源文件编译成class文件
		}.findAll {
			GroovyTestCase.class.isAssignableFrom(it); // 过滤掉所有不是继承自GroovyTestCase的类
		}.each { suite.addTestSuite(it) }
	}
}
