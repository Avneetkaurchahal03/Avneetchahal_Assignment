public class String3 {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
String a=str.toLowerCase();
String b=str.toUpperCase();
String c=str.replace('a','$');
boolean d=str.contains("collections");
String e= "java string pool refers to collection of strings which are stored in heap memory" ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(str.compareTo(e));
		System.out.println(str.compareToIgnoreCase(e));
		
		
		

	}
}