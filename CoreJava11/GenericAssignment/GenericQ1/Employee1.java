public class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	int salary;
	String department;		
	


	

	/*public Employee1(int id1, String name1, int salary1,String department1 ) {
		id=id1;
		// TODO Auto-generated constructor stu
		this.name = name1;
		this.salary = salary1;
	}*/

	





	public Employee1(int id1, String name1, int salary1,String department1) {
		// TODO Auto-generated constructor stub
		this.id=id1;
		this.name=name1;
		this.salary=salary1;
		this.department=department1;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
		
	}
	public String  getDepartment()
	{
		return department;
	}
	
	@Override public String toString() {
		return "Employee [id = "+id +", name = "+name +", salary = "+salary +",department="+department+ "]";
	}

	public int compareTo(Employee1 o) {
		return this.getId() - o.getId() ;
		
	}

	/*@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Employee1)) {
			return false;
		}

		return true;
}*/
}
