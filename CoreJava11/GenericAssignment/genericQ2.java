import java.util.*;
public class genericQ2 {
	public static void main(String [] args) {
		HashMap<Integer, Double> v = new HashMap<>();
		Random n = new Random();
		for(int i = 0; i < 10; i++) {
			int Key = 1 + n.nextInt(100);
			double value = 1 + n.nextDouble();
			
			v.put(Key,value);
		}
		
		System.out.println("key : value");
			System.out.println(v);
		
	}
}