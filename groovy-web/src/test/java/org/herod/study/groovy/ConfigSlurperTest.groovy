/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class ConfigSlurperTest extends GroovyTestCase {

	def file;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		file = getClass().getResource("ConfigSlurperConfiguration.script");
		assertNotNull(file);
	}

	void testConfigSlurper() {
		def config = new ConfigSlurper().parse(file.toURI().toURL());
		assertEquals("hello", config.configruation.file);
		assertEquals(10, config.configruation.size);
	}

	void testConfigSlurperWithOtherEnv() {
		def config = new ConfigSlurper("other").parse(file.toURI().toURL());
		assertEquals("hello", config.configruation.file);
		assertEquals(10, config.configruation.size);
	}

	void testConfigSlurperWithTestEnv() {
		def config = new ConfigSlurper("test").parse(file.toURI().toURL());
		assertEquals("hello", config.configruation.file);
		assertEquals(100, config.configruation.size);
	}

	void testConfigSlurperWithDevEnv() {
		def config = new ConfigSlurper("development").parse(file.toURI().toURL());
		assertEquals("haha", config.configruation.file);
		assertEquals(10, config.configruation.size);
	}
}
