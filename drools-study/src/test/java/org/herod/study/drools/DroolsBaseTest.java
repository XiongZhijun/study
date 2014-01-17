/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import org.junit.Before;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

import os.cherry.test.SystemOutHelper;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class DroolsBaseTest {

	protected KieServices kieServices;
	protected KieContainer kieContainer;
	protected SystemOutHelper systemOutHelper;

	@Before
	public void setUp() {
		systemOutHelper = new SystemOutHelper();
		kieServices = KieServices.Factory.get();
		kieContainer = kieServices.getKieClasspathContainer();
	}

}
