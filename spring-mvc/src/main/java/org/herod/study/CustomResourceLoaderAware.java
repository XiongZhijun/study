package org.herod.study;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class CustomResourceLoaderAware implements ResourceLoaderAware {

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("CustomResourceLoaderAware do");
	}

}
