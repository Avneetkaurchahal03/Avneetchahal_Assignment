import java.util.*;
	import java.io.IOException; 
	public class genericQ1 {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Set<Employee1> employees = new HashSet<>(); 
			
		employees.add(new Employee1(1, "Mahak", 10000,"B.tech"));
		employees.add(new Employee1(2, "Niraj", 20000,"B.tech"));
		employees.add(new Employee1(3, "Mehar", 10000,"B.tech"));
		employees.add(new Employee1(4, "Bhargavi", 40000,"B.tech"));
		employees.add(new Employee1(5, "Abhishek", 30000,"B.tech"));
		employees.add(new Employee1(1, "Rihana", 50000,"B.tech"));
		employees.add(new Employee1(1, "Karen", 60000,"B.tech"));
		
		System.out.println("Total number of Employees: "+employees.size());
		for(Employee1 e: employees) {
			System.out.println(e);
		}
	}
}
