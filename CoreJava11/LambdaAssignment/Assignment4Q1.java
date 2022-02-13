import java.util.*;
public class Assignment4Q1 {
	
		public Calculator addition(double a,double b) {
			double o1;
			System.out.println("addition");
			  Calculator add = (x,y) -> System.out.println(x+y);
             add.operations(a,b);
             return add;
             
		}
				
			public Calculator subtraction(double m,double n){
				double o2;
				System.out.println("subtraction");
				 Calculator sub= (x,y) -> System.out.println(x-y);
	                sub.operations(m,n);
	                return sub;
			}
	 public Calculator multiplication(double g, double h){
		 double o3;
		 System.out.println("multiplication");
		 Calculator multi=(x,y) -> System.out.println(x*y);
            multi.operations(g,h);
            return multi;
	}
			
	   public Calculator division(double o,double p){
	 System.out.println("division");
	 Calculator div=(x,y) -> System.out.println(x/y);
        div.operations(o,p);
        return div;
	 }
	   public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the numbers");
	    	int num1,num2;
	    	num1=sc.nextInt();
	    	num2=sc.nextInt();
	    Assignment4Q1 obj=new Assignment4Q1();
	    obj.addition(num1,num2);
	    obj.subtraction(num1,num2);
	    obj.multiplication(num1,num2);
	    obj.division(num1,num2);
	    }
	}


interface Calculator {
	void operations(double a ,double b);
}

