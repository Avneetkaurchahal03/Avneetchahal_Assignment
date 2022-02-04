import java.util.*;
import java.io.IOException;


public class CollectQ1 {
	public static void main(String[] args) throws IOException{
	Scanner sc=new Scanner(System.in);
		TreeMap<Long, Contact> contactMap = new TreeMap<>();

		int choice;

		 do {
			System.out.print("Enter 1 to input values 2 to exit: ");
			choice = sc.nextInt();;

			if(choice== 2)
				break ;

			System.out.print("Enter Phone Number: ");
			long  phoneNumber = sc.nextLong();
			System.out.print("Enter Name: ");
			String name = sc.next();

			System.out.print("Enter Email: ");
			String email = sc.next();
			

			System.out.print("Enter Gender(M/F): ");
			String gender = sc.next();

			contactMap.put(phoneNumber , new Contact(phoneNumber, name, email, gender));

			for(Long p: contactMap.keySet()) {
				System.out.print(p);
				System.out.println(contactMap.get(p));
				System.out.println("  ");
			}

		}while(choice != 2);	

		System.out.print("Successfully run");
	}

}


