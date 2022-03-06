package com.avneet;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.MessageSource;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class test5 {
		static MessageSource messageSource;
	    public static void main( String[] args ){
	        ApplicationContext context = new ClassPathXmlApplicationContext("Question6.xml");
	        project p = (project)context.getBean("project");
	        p.projectInfo();
	        
	        messageSource = (MessageSource)context.getBean("messageSource");
	        String msg = messageSource.getMessage("message", null, "Hello",null);
	        System.out.println(msg);
	        
	    }
	}


