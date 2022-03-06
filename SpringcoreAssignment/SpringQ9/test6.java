package com.avneet;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

class test6{
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Question8.xml");
         ((ConfigurableApplicationContext) context).registerShutdownHook();
        Student3 obj = (Student3) context.getBean("student");
        obj.getDetails();
}
	}
