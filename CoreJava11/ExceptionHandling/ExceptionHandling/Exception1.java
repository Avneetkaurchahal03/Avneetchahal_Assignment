import java.util.Scanner;
public class Exception1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the First number: ");
			int a = sc.nextInt();
			System.out.print("Enter the second number: ");
			int b = sc.nextInt();
			
			try {
			    int c = a / b;
			    System.out.println("result "+c);
			}catch(ArithmeticException e) {
			    System.out.println("Error: "+e);
			}
			sc.close();
		}

	}
