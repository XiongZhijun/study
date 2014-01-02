package org.herod.study;

import static org.junit.Assert.*;

import java.beans.PropertyEditorManager;

import org.junit.Test;

public class PropertyEditorTest {

	@Test
	public void test() {
		assertEquals(MyUserEditor.class,
				PropertyEditorManager.findEditor(MyUser.class).getClass());
	}
}
