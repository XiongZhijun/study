/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class HouseOfDoomTest {

	@Test
	public void test() {
		KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("HouseOfDoomKS");

		ksession.insert(new Location("Office", "House"));
		ksession.insert(new Location("Kitchen", "House"));
		ksession.insert(new Location("Knife", "Kitchen"));
		ksession.insert(new Location("Cheese", "Kitchen"));
		ksession.insert(new Location("Desk", "Office"));
		ksession.insert(new Location("Chair", "Office"));
		ksession.insert(new Location("Computer", "Desk"));
		ksession.insert(new Location("Draw", "Desk"));

		ksession.insert("go1");
		ksession.fireAllRules();
		System.out.println("---");

		ksession.insert("go1");
		ksession.insert("go2");
		ksession.fireAllRules();
		System.out.println("---");

		ksession.insert("go3");
		ksession.fireAllRules();
		System.out.println("---");

		ksession.insert(new Location("Key", "Draw"));
		ksession.fireAllRules();
		System.out.println("---");

		ksession.insert("go4");
		ksession.fireAllRules();
		System.out.println("---");

		ksession.insert("go5");
		ksession.fireAllRules();
	}

}
