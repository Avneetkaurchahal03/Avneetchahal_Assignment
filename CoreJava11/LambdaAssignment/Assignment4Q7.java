import java.util.HashMap;
import java.util.Map;
public class Assignment4Q7 {
    public static void main(String[] args) {
Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Milk");
		map.put(2, "Butter");
		map.put(3, "Paneer");
		map.put(4, "Ghee");
		map.put(5, "Curd");
		Assignment4Q7 a=new Assignment4Q7();
		System.out.println(Assignment4Q7.convertKeyValueToString(map ));
		
    }
    public static String convertKeyValueToString(Map<Integer, String> map) {
    	StringBuilder buffer= new StringBuilder(" ");
    	map.entrySet().forEach(entry->buffer.append(entry.getKey()).append(entry.getValue()));
		return buffer.toString();
    }
}