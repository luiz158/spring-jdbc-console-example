package com.mangani.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-resources.xml");
		Processor processor = appContext.getBean(Processor.class);
		processor.process();
	}
}
