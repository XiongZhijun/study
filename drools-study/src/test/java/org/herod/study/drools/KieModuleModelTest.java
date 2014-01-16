/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.drools;

import org.drools.compiler.kproject.models.KieModuleModelImpl;
import org.junit.Test;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieSessionModel;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
public class KieModuleModelTest {

	@Test
	public void testToXml() {
		KieModuleModelImpl moduleModel = new KieModuleModelImpl();
		KieBaseModel baseModel1 = moduleModel.newKieBaseModel("baseModel1");
		baseModel1.addPackage("org.herod.study.drools");
		KieSessionModel sessionModel1 = baseModel1
				.newKieSessionModel("sessionModel1");
		sessionModel1.setDefault(true);
		System.out.println(moduleModel.toXML());
	}
}
