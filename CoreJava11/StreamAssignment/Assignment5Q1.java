import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Assignment5Q1 {
	public static void main(String[] args) {
		ArrayList<Fruit>fruits = new ArrayList<>();
		
        fruits.add(new Fruit("Mango", 70, 80, "Yellow"));
        fruits.add(new Fruit("Apple", 80, 120, "Red"));
        fruits.add(new Fruit("Banana", 90, 60, "Yellow"));
        fruits.add(new Fruit("Orange", 100, 100, "Orange"));
        fruits.add(new Fruit("Grapes", 60, 40, "Violet"));
        fruits.add(new Fruit("strawberry", 60, 40, "Red"));
        
        reverseSort(fruits);
        sort(fruits);
        filterRedSortPrice(fruits);
	}

	public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> fruitName = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> fruitName1 = new ArrayList<>();
        for(Fruit fruit:fruitName){
            fruitName1.add(fruit.getName());
        }
        System.out.println(fruitName1);
        
        return fruitName1;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
        Fruits = Fruits.stream().sorted(Comparator.comparing(Fruit::getColor))
        		.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(Fruits);
        
        return Fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits = fruits.stream().filter(p -> p.getColor().equals("Red"))
        		.sorted(Comparator.comparingInt(Fruit::getPrice))
        		.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(fruits);
        return fruits;
    }
}


