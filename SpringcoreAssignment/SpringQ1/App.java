package com.avneet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext avneet= new ClassPathXmlApplicationContext("Question1.xml");
   Customer customerdata=(Customer)avneet.getBean("customer");
   System.out.println(customerdata);
    }
}
