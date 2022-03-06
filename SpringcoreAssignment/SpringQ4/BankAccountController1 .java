package com.avneet;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class BankAccountController1 implements ApplicationContextAware {
	
    private ApplicationContext context;
    
    public double withdraw(long accountId, double balanceToBeWithdraw){
        double newBalance=0;
        BankAccountService acc=(BankAccountService) context.getBean("service");
        newBalance = acc.withdraw(accountId,balanceToBeWithdraw);
        return newBalance;
    }
    
    public double deposit(long accountId, double balance){
        BankAccountService acc=(BankAccountService) context.getBean("service");
        double newbalance = acc.deposit(accountId,balance);
        return newbalance;

    }
    public double getBalance(long accountId){

        BankAccountService acc=(BankAccountService) context.getBean("service");
       return acc.getBalance(accountId);

    }
    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        BankAccountService acc=(BankAccountService) context.getBean("service");
        return acc.fundTransfer(fromAccount,toAccount,amount);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
