import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

public class Assignment4Q5 {
    
	 List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
    	 System.out.println(processWords(list,System.out::println));
    	}
    public static Consumer<String> processWords(List<String> list,Consumer<String> consumer) {
    	StringBuilder buffer = new StringBuilder("");
    	for (String str : list) {
			buffer.append(str.charAt(0));
		}
		
		consumer.accept(buffer.toString().toUpperCase());
		return consumer;
	}
}