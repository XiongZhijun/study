/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy;

import static org.junit.Assert.*
import groovy.xml.MarkupBuilder

import org.codehaus.groovy.runtime.StringBufferWriter
import org.junit.Test

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class GroovyMarkupTest extends GroovyTestCase{

	@Test
	public void test() {
		StringBuffer buffer = new StringBuffer();
		MarkupBuilder builder = new MarkupBuilder(new StringBufferWriter(buffer));
		builder.html {
			head { title 'Test' }
			body(style:'width:100px') {
				div { p('Hello world') }
			}
		};
		assertEquals("""<html>
  <head>
    <title>Test</title>
  </head>
  <body style='width:100px'>
    <div>
      <p>Hello world</p>
    </div>
  </body>
</html>""",buffer.toString());
	}
}
