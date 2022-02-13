import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Question5 {
	  public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        var pathtofile ="C:\\Users\\HP\\Downloads\\record.txt";
	       
	        System.out.println("Enter number of items");
	        int number= sc.nextInt();
	        do {
	        System.out.println("Select Your choice");
	        System.out.println("1}Insert New Price 2}View Purchase Total 3}Exit");
	       int item=1;
	        int choice= sc.nextInt();
	        boolean b = true;
	        switch (choice){
	            case 1: {
	                System.out.println("Enter the Price of item " + item + ": ");
	                String price = sc.next();
	                Files.writeString(Path.of(pathtofile), price+"\n", StandardOpenOption.APPEND);
	                System.out.println("Price has been saved in file");
	                break;
	            }
	            case 2:{
	                Scanner read=new Scanner(Files.readString(Path.of(pathtofile)));
	                int total=0;
	                while (read.hasNext()){
	                    total = total+read.nextInt();
	                }
	                System.out.println("Your total is: "+total);
	                break;
	            }
	            case 3:{
	                System.out.println("exit program....");
	                break;
	            }
	        }
	  }
	        while(number>0);
	    }
	}

