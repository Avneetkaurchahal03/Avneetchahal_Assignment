import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class genericQ4 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		Pair<String, String> str = new Pair<>();
        str = new Pair<>("Abhishek","28000");
        
        System.out.println("Key: "+str.getKey()+" Value: "+str.getValue());
        
     
        
        Pair<String, Date> strDatePair = new Pair<>();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
       
        
        //try{
        	System.out.print("Enter date in yyyy-mm-dd format for strDatePair: ");
        	String strDate = sc.nextLine();
        	
        	Date date1 = date.parse(strDate);
        	strDatePair = new Pair<>("Abhishek", date1);
        	
        	
        	System.out.println("Key: "+strDatePair.getKey()+" Value: "+strDatePair.getValue());
        //}catch (Exception e){
          // System.out.println("Parse Exception");
       // }//finally {
			//sc.close();
		//}
	}