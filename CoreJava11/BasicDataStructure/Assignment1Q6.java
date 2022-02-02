
import java.util.*;	
import java.io.*;
import java.lang.*;
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass)  {
Scanner sc=new Scanner(System.in);
    	int i=1;
    	 
    	while(i<=3) {
    		System.out.println("Enter userId");
        	String userId=sc.next();
        	System.out.println("Enter password");
        	String pass1=sc.next();
    		if(user.equals(userId)&&(pass1.equals(password)))
    		{
    			System.out.println("welcome Ajay");
    			break;
    			
    	}
    		i++;
    			
    		if(i==1|| i==2 || i==3) {
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			}
    	}
    	if(i>3) {
    		System.out.println("You have entered wrong credentials 3 times");
    		System.out.println("Contact Admin");
    	}
    			
    	
    			
    	
    		
  
    	
 
    	return ".";
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	
    	Login l=new Login();
  
    	 String userId = "Ajay",password = "password";
    	
    	System.out.println(l.loginUser( userId,password));
    	
    }
}
