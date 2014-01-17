/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import java.util.Arrays;

import org.junit.Test;
import org.kie.api.runtime.StatelessKieSession;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class ApplicantTest extends DroolsBaseTest {

	@Test
	public void test() {
		StatelessKieSession session = kieContainer.newStatelessKieSession();
		Applicant applicant1 = new Applicant("zhangsan", 15);
		Applicant applicant2 = new Applicant("lisi", 16);
		Application application = new Application();
		session.execute(Arrays.asList(applicant1, applicant2, application));
	}
}
