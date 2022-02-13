import java.io.*;
import java.util.*;
class BankAccount {
    long id;
    double balance;
    public BankAccount(long id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public void withdraw(int Withdrawl_amount) throws InsufficientBalanceException{
        if(Withdrawl_amount>balance || balance==0){
            throw new InsufficientBalanceException("Exception");
        }
        balance=balance-Withdrawl_amount;
        System.out.println("You've received "+ (int)(Withdrawl_amount)+" in cash:" );
    }

}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String exception){
        super(exception);
    }
}
public class Bank {
	public static void main(String [] args) throws InsufficientBalanceException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Id");
		long Id=sc.nextLong();
		System.out.println("Enter the balance");
		double bal=sc.nextDouble();
		System.out.println("Enter the amount to be withdraw");
		int Withdraw=sc.nextInt();
		 BankAccount customer = new BankAccount(Id,bal);
		 customer.withdraw(Withdraw);
	    }

	}

