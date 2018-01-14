package com.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //added this as this is a configuration class
@EnableWebMvc // added this as it provides similar functionality to <mvc:annotation-driven>
@ComponentScan(basePackages="com.springsecurity")//this tells to look at all controllers and other classes
public class AppConfig {

	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}
