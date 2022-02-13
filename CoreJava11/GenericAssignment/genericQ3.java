import java.util.*;
public class genericQ3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(50);
		list.add(65);
		list.add(34);
		list.add(76);
		list.add(40);
		
		System.out.println("List Before Exchange: "+list);
		
		int index1 = sc.nextInt();//to enter index to change
		//int index2 = sc.nextInt();//to enter index with change 
		int index2=list.size() - 1;
		exchange(list, index1, index2);
	}
	


		
		public static <T> void exchange(List<T> list, int index1, int index2) {
			Collections.swap(list, index1, index2);
			System.out.println("List After Exchange: "+list);
			
		}
	}


