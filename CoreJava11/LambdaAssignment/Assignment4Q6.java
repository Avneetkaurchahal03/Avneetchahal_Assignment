import java.util.ArrayList;
import java.util.List;

public class Assignment4Q6 {
    public static void main(String[] args) {
List<String> arlist = new ArrayList<>();
		
arlist.add("Mahak");
arlist.add("Avneet");
arlist.add("Abhishek");
arlist.add("Ana");
arlist.add("Sakshi");
arlist.add("helen");
Assignment4Q6 obj=new Assignment4Q6();
System.out.println(obj.convertToUpperCase(arlist));
		
    }
    public List<String> convertToUpperCase(List<String> list) {
    	list.replaceAll(word -> word.toUpperCase());
    	return list;
    }  
}