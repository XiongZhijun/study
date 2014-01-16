/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import java.util.Arrays;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class ApplicantTest {

	@Test
	public void test() {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer container = kieServices.getKieClasspathContainer();
		StatelessKieSession session = container.newStatelessKieSession();
		Applicant applicant1 = new Applicant("zhangsan", 15);
		Applicant applicant2 = new Applicant("lisi", 16);
		Application application = new Application();
		session.execute(Arrays.asList(applicant1, applicant2, application));
	}
}
