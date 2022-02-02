import java.io.*;
import java.util.*;
import java.lang.Math;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double si=  (principalAmount*interestRate*time)/100;
    	return  si;
    	
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double ci =( principalAmount*(Math.pow((1+ interestRate),time)))-principalAmount;
    	return ci;
    }
}

public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner sc=new Scanner(System.in);
    	
    	double principalAmount;
    	
    	int time;
    	double interestRate;
    	System.out.println("Principal");
    	principalAmount =sc.nextDouble();
    	System.out.println("interestRate");
    	interestRate=sc.nextDouble();
    	System.out.println("time");
    	time=sc.nextInt();
    	SiCi s= new SiCi();
    	System.out.println("Simple Interest "+s.simpleInterest( principalAmount, time, interestRate));
    	System.out.println("Compound Interest "+s.compoundInterest( principalAmount,time, interestRate));
    	
    }
}




