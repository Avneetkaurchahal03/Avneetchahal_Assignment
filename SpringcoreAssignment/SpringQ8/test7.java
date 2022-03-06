package com.avneet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test7 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Question8.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}
}



