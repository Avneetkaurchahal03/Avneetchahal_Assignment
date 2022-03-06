package com.avneet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Question3.xml");
		
		BankAccountController1 Controller = (BankAccountController1) context.getBean("controller");

			
			System.out.println("Present Balance in Account 1: " + Controller.getBalance(1000));
			System.out.println("After Deposit in Account 1: " + Controller.deposit(1000, 2500));
			System.out.println("Current Balance in Account 1: " + Controller.getBalance(2500));
			
			
			System.out.println("\n Transferring balance from Account 1 to Account 2");
			System.out.println("Present Balance in Account 2: "+Controller.getBalance((2200)));
			Controller.fundTransfer(1000, 2200, 8000);
			System.out.println("Current Balance in Account 2: "+Controller.getBalance(2200));

		}
	}

