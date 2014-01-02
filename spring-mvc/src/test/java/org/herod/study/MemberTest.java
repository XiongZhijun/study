package org.herod.study;

import static org.junit.Assert.*;

import java.lang.reflect.Member;

import org.junit.Test;

public class MemberTest {

	@Test
	public void testGetDeclaringClass() throws SecurityException,
			NoSuchMethodException {
		Member method1 = ClassA.class.getMethod("method1", Boolean.TYPE);
		assertEquals(ClassA.class, method1.getDeclaringClass());

	}

	public static class ClassA {
		public void method1(Boolean a) {

		}
	}
}
