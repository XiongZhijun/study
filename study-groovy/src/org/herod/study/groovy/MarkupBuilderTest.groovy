package org.herod.study.groovy

import groovy.xml.MarkupBuilder;

import org.junit.Test

class MarkupBuilderTest {

	@Test
	public void test() {
		MarkupBuilder builder = new MarkupBuilder();
		builder.html {
			this.hi()
			head {
				this.hi()
				title('fuckyou')
			}
			body()
		}
	}
	
	void hi() {
		println 'say hi!'
	}
	
}
