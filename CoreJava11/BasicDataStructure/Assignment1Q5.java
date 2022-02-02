import java.util.*;	
import java.io.*;
import java.lang.*;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double tax =0.0;
    	if ((ctc >0) && (ctc<=180000 )) {
    		return 0.0;
    	}
    	else if   ((ctc >180000) && (ctc<=300000 )) 	 {
    		tax=(ctc-180000)*0.1;
    		return tax;
    		
    	}
    
    	else if((ctc >300000) && (ctc<=500000 )) {
    		tax=(((ctc-300000)*0.2)+(300000*0.1));
    		return tax;}
    		
    	
        	
    	else if ((ctc >500000) && (ctc<=1000000 ))
        		{
        			tax=(((ctc-500000)*0.3)+(500000*0.2));
        			return tax;
        		}
        		return tax;
    	
    
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("salary per year");
    	int ctc=sc.nextInt();
    	TaxAmount t=new TaxAmount();
    	System.out.println(t.calculateTaxAmount(ctc));
    }
}
