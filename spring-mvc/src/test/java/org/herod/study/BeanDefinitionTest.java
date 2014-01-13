/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 * 
 */
@ContextConfiguration
public class BeanDefinitionTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void test() {
	}

	public static class RemoteServiceBeanFactoryPostProcessor implements
			BeanFactoryPostProcessor {

		@Override
		public void postProcessBeanFactory(
				ConfigurableListableBeanFactory beanFactory)
				throws BeansException {
			testService1(beanFactory);
			testService2(beanFactory);
		}

		private void testService2(ConfigurableListableBeanFactory beanFactory) {
			BeanDefinition beanDefinition = beanFactory
					.getBeanDefinition("service2");
			assertEquals("absService", beanDefinition.getParentName());
		}

		private void testService1(ConfigurableListableBeanFactory beanFactory) {
			BeanDefinition beanDefinition = beanFactory
					.getBeanDefinition("service1");
			assertEquals(GenericBeanDefinition.class, beanDefinition.getClass());
			assertNull(beanDefinition.getParentName());
			assertEquals(0, beanDefinition.getConstructorArgumentValues()
					.getArgumentCount());
			assertEquals(2, beanDefinition.getPropertyValues().size());
			assertFalse(beanDefinition.isAbstract());
			assertEquals("org.herod.study.BeanDefinitionTest.RemoteService",
					beanDefinition.getBeanClassName());
		}

	}

	public static class RemoteService {

		String serviceUrl = "localhost";
		int port = 80;

		public RemoteService() {
			super();
		}

		public RemoteService(String serviceUrl) {
			super();
			this.serviceUrl = serviceUrl;
		}

		public void setServiceUrl(String serviceUrl) {
			this.serviceUrl = serviceUrl;
		}

		public void setPort(int port) {
			this.port = port;
		}

	}
}
