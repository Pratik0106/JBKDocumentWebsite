package com.jbk.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Application Initalizer getRootConfigClasses()");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("Application Initalizer getServletconfigClasses()");
	
		
		return new Class[] {WebConfig.class,HibConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Application Initalizer getServletMappings()");
		return new String[] { "/"};
	}

}
