/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import os.cherry.lang.io.StringBuilderOutStream.Filter;
import static org.junit.Assert.*;
import static os.cherry.test.SystemOutHelper.*;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class TimerTest extends DroolsBaseTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
//		systemOutHelper.redirectOut();
//		systemOutHelper.addFilter(new LoggerFilter());
	}

	@Test
	public void test() throws InterruptedException {
		final KieSession session = kieContainer.newKieSession("TimerTestKS");
		Location location = new Location("item", "location");
		session.insert(location);
		new Thread("TEST") {
			public void run() {
			};
		}.start();
		session.fireUntilHalt();
//		Thread.sleep(5 * 1000);
		assertEquals("", location.getItem());
//		systemOutHelper.assertOutString("Haha......" + LINE_SEPARATOR);
	}

	private static class LoggerFilter implements Filter {
		public boolean ignore(String str) {
			return Pattern.matches(".*\\[.+\\].*\\s*", str);
		}

	}
}
