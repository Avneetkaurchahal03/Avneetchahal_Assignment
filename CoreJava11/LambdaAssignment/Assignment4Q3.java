import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
	/*static void modifyValue(){ 
		Function<Integer, Double> interface1 = y -> y / 2.0;
        System.out.println(interface1.apply(76));
        
	}*/
   /* static class Product 
    {    Consumer<Integer> display = x -> System.out.println(x);
    display.accept(45);
}*/
    //static void display() { }
	public static void main(String[] args) {
		Function<Integer, Double> interface1 = y -> y / 2.0;
        System.out.println(interface1.apply(76));
        
       Supplier<Double> interface2 = () -> Math.random();
        System.out.println(interface2.get());
       
        Predicate<Integer> lesserThan = i -> (i < 25); 
        System.out.println(lesserThan.test(6));
        
        
        Consumer<Integer> display = x -> System.out.println(x);
        display.accept(45);
	}

}

