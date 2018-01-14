package com.springsecurity;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//This is similar to the dispatcher servlet setup in web.xml
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{AppConfig.class};
	}

	//this is similar to servlet mapping in web.xml
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
