/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package org.herod.study.groovy

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
class StringBufferOutputStream extends OutputStream {
	StringBuffer buffer;

	public StringBufferOutputStream(StringBuffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void write(int b) throws IOException {
		buffer.append((char) b);
	}
}

