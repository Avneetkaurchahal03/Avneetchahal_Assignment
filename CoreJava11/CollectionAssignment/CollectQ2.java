import java.util.*;
public class CollectQ2 {
	public static void main(String[] args) {
		Set<String> products = new TreeSet<>();

		System.out.println(" add 10 daily products");

		products.add("Ayran");
		products.add("Butter milk");
		products.add("Butter");
		products.add("Milk");
		products.add("cheese");
		products.add("cream");
		products.add("clotted cream");
		products.add("cottage cheese");
		products.add("Ghee");
		products.add("whipped cream");
		products.add("whipped cream");
		System.out.println(products);
		System.out.println("Size: "+ products.size());
}
}
