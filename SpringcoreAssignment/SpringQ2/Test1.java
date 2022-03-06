package com.avneet;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
	
		public static void main(String[] args) {
			
			 ApplicationContext context= new ClassPathXmlApplicationContext("Question2.xml");
			System.out.println("--List--");
			list list=(list)context.getBean("ansList");
			System.out.println(list);
			
			System.out.println("--Set--");
			set set=(set)context.getBean("ansSet");
			System.out.println(set);
			System.out.println("--Map--");
			map map=(map)context.getBean("ansMap");
			System.out.println(map);
			
			
		}

	}



