import java.util.Scanner;
import java.io.*;
	public class Exception2 {
			public static void main(String[] args)throws IOException {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the First number: ");
				int a = sc.nextInt();
				System.out.print("Enter the second number: ");
				int b = sc.nextInt();
				
				try {
					if(b == 0)
						throw new UnsupportedOperationException("/ by 0 is not allowed");
				    int c = a / b;
				    System.out.println("result "+c);
				}catch (UnsupportedOperationException e) {
					System.out.println("Error: "+e.getMessage());
				}
				sc.close();
			}

		}