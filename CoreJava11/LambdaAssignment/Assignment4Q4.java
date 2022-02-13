import java.util.ArrayList;
import java.util.List;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	
		
		employeeList.removeIf(word -> word.length()%2 != 0);
		
		return employeeList;
		}
    
    public static void main(String[] args) { 
    	ArrayList<String> employee =new ArrayList<>();
    	employee.add("Mahak");
		employee.add("Avneet");
		employee.add("Abhishek");
		employee.add("Ana");
		employee.add("Sakshi");
		employee.add("helen");
    	Assignment4Q4 obj =new Assignment4Q4 ();
    	System.out.println(obj.removeOddLength(employee));
    }
}