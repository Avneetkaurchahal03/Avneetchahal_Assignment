import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
	
	public class CollectQ3 {

		public static void main(String[] args) throws IOException{

		Scanner sc=new Scanner(System.in);

			TreeSet<Employee> employeeSet = new TreeSet<>();

			employeeSet.add(new Employee(6, "KAYLING", "Dept6", 60000));
			employeeSet.add(new Employee(9, "Liam", "Dept9", 90000));
			employeeSet.add(new Employee(3, "Noah", "Dept3", 30000));
			employeeSet.add(new Employee(8, "Olivia", "Dept8", 80000));
			employeeSet.add(new Employee(4, "Emma", "Dept4", 40000));
			employeeSet.add(new Employee(2, "oliver", "Dept2", 20000));
			employeeSet.add(new Employee(7, "Ava", "Dept7", 70000));
			employeeSet.add(new Employee(1, "charlotte", "Dept1", 10000));
			employeeSet.add(new Employee(5, "Elijah", "Dept5", 50000));
			employeeSet.add(new Employee(10, "windy", "Dept10", 100000));

			List<Employee> list = new ArrayList<>();

			list.add(new Employee(14, "pamela", "Dept14", 14000));
			list.add(new Employee(12, "Joseph", "Dept12", 12000));
			list.add(new Employee(13, "Ethan", "Dept13", 13000));
			list.add(new Employee(11, "Monica", "Dept11", 11000));

			for(Employee e: list) {
				employeeSet.add(e);
			}

		int choice;

			do {
				System.out.print("Enter 1 to input data, 2 to view data and 3 to exit: ");
				choice=sc.nextInt();

				if(choice==3)
					break;

				switch(choice) {
				case 1: 
					for(Employee e: list) {
						employeeSet.add(e);
					}
					
					break;
				case 2: 
					for(Employee e: employeeSet) {
						System.out.println(e);
					}
					break;	
				default:
					System.out.println("Invalid option. Please enter a valid option!");
				}
			}while(choice!= 3);

			System.out.println("Application Run");
		}

	}


