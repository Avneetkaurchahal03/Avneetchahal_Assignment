package com.avneet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Question3.xml");
		
		//BankAccountController Controller = (BankAccountController) context.getBean("controller");

			BankAccountController accountController = (BankAccountController) context.getBean("controller");

			System.out.println("Present Balance in Account 1: " + accountController.getBalance(2000));//2000 1161
			System.out.println("After Deposit in Account 1: " + accountController.deposit(2000, 3500));// 2000 3500
			System.out.println("Current Balance in Account 1: " + accountController.getBalance(3500));//2000
			
			
			System.out.println("\n Transferring balance from Account 1 to Account 2");
			System.out.println("Present Balance in Account 2: "+accountController.getBalance((2200)));//2200
			accountController.fundTransfer(2000, 2200, 8000);//2000 2200 9000
			System.out.println("Current Balance in Account 2: "+accountController.getBalance(2200));//2200

		}
	}

