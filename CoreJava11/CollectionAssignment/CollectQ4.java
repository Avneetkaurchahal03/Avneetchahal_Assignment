//The parse () method of Java date class tries to interpret the string 's' as date and time representation. If this attempt is successful then it will return number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this string argument
import java.util.*;
import java.io.*;
import java.time.*;
public class CollectQ4 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
List<LocalDate> list = new LinkedList<>();
		
//list.add(LocalDate.of(2002, 8, 10));
//list.add(LocalDate.of(1999, 8, 30));
//list.add(LocalDate.of(1996, 11, 14));
//list.add(LocalDate.of(2000, 01, 03));

		LocalDate thisyear=LocalDate.now();
		list.add(thisyear);
		LocalDate previousyear=LocalDate.now().minusYears(1);
		//it tell us which previous year was leap year
		
		list.add(previousyear);
		LocalDate nextyear=LocalDate.now().plusYears(1);// it tell us which previous year is going leap year
		list.add(nextyear);
		
		
		System.out.println(thisyear.isLeapYear());
		System.out.println(previousyear.isLeapYear());
		System.out.println(nextyear.isLeapYear());
		
		
		
		//System.out.println("Your Date of Birth is "+list.get(1)+" and it "+CheckLeapYear(list.get(1)));//enter the index number in get method and it will tell you whether it is leap year or not
		
	/*public static String CheckLeapYear(LocalDate localDate) {
		if(((localDate.getYear()%4 == 0) && (localDate.getYear()%100 != 0)) || (localDate.getYear()%400 == 0))
			return "was a leap year";
		return "wasn't a leap year";}*/
	}

}

