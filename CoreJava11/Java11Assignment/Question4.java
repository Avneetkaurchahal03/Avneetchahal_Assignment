import java.io.BufferedReader;
import java.io.*;
import java.util.*;	
import java.io.IOException;
	
public class Question4{
	public static void main(String[] args) throws IOException
	{
	File file =new File("C:\\Users\\HP\\Downloads\\Java11Assignments_StudentList.txt");

	FileInputStream fileInputStream=new FileInputStream(file);
	InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	
	BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
	String line;
	int count=0;
	int studentCount=0;
	 int wordCount=0;
	while ((line = bufferedReader.readLine()) != null) {
        if (line.equals("" )) {
             count += 1;
        }
	
        else {
        	String []students =line.split("[!?.:]+");
        	 studentCount+= students.length;
        	//String words[] = line.split("\\s+");
           //count += words.length;
           System.out.println(Arrays. toString(students));
       
           String words[] = line.split("\\s+ ");
           wordCount += words.length;
	

	
	}
        
        //String words[] = line.split("\\s+");
        //count += words.length;
       // System.out.println(count);
    
	}
	
	 System.out.println(wordCount);
	 //var paths="C:\\Users\\HP\\Downloads\\Java11Assignments_StudentList.txt";
	 //System.out.println("All the Students in the list are: ");
    // Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
     //int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
    // System.out.println("The numbers of students in the sheet is: "+x);
	}	
	}
