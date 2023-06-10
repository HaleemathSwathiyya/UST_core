package com.ust.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		
		ApplicationContext cntxt = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hello = (HelloWorld) cntxt.getBean("HelloBean");
		System.out.println(hello.message());
	}

}
