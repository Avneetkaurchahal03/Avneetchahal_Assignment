import java.util.Scanner;  
import java.lang.Math;  

public class Assignment1Q1 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		ArmstrongOrNot a=new ArmstrongOrNot();
	System.out.println(a.armstrongCheck(num));
		sc.close();
		
	}

}
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int m;
    	int digit=0;
    	double sum=0;
    	int l=0;
    m=num;
    
    	while(m>0)    
    	{   
    	m = m/10;   
    	digit++;   
    	}   
    	m = num;   
    	while(m>0)   
    	{   
    	    
    	l = m% 10;   
    	 
    	sum =sum+  (Math.pow(l, digit));   
     
    	m = m/10;   
    	}  
    	if(num==sum) {
    		return true;}
    	else {
    		return false;}
    	
    }
    }
