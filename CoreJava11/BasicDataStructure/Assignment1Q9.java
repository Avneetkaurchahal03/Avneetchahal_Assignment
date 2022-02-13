import java.util.*;
class Student {
    
    public int studentsTotalMarksInAllSubjects(int[] students) {
        int sum=0;
        for(int i=0;i<3;i++){
            sum = sum + students[i];
        }
        return sum;
    }
    public double studentsAverageMarksInAllSubjects(int[] students) {
        double avg=0;
        for(int i=0;i<3;i++){
            avg =  studentsTotalMarksInAllSubjects(students)/3.0;
        }
        return avg;
    }

    public int subjectATotalByStudents(int[] marks1) {
        int total;
        total = marks1[0]+marks1[1]+marks1[2];
        return total;
    }
    public int subjectBTotalByStudents(int[] marks2) {
        int total1;
        total1 = marks2[0]+marks2[1]+marks2[2];
        return total1;
    }
    public int subjectCTotalByStudents(int[] marks3) {
        int total3;
        total3 = marks3[0]+marks3[1]+marks3[2];
        return total3;
    }
    //public int (subjectTotalByStudents(int[] marks);
    public double subjectAAverageByStudents(int[] marks1) {
        double avg1;
        avg1 = subjectATotalByStudents(marks1)/3.0;
        return avg1;
    }
    public double subjectBAverageByStudents(int[] marks2) {
        double avg2;
        avg2 = subjectATotalByStudents(marks2)/3.0;
        return avg2;
    }
    public double subjectCAverageByStudents(int[] marks3) {
        double avg3;
        avg3 = subjectATotalByStudents(marks3)/3.0;
        return avg3;
    }
}
public class Assignment1Q9 {
    public static void main(String[] args) {
        
            int[] mark1 = new int[3];
            int[] mark2 = new int[3];
            int[] mark3 = new int[3];
            int j=0;
            Scanner s = new Scanner(System.in);
            for (int i = 0; i<3; i++) {
            	  System.out.println("student "+(++j));
                System.out.println("Enter marks for A,B,C sub : ");
                mark1[i] = s.nextInt();
                mark2[i] = s.nextInt();
                mark3[i] = s.nextInt();
            }
            Assignment1Q9 a = new Assignment1Q9();
            
            int[] y;
            y = a.total(mark1,mark2,mark3);
            Student sd = new Student();
        System.out.println(sd.studentsTotalMarksInAllSubjects(y));//Total marks of all the students in all subjects
             System.out.println(sd.studentsAverageMarksInAllSubjects(y));  //Average marks of all the students in all subjects
        System.out.println(sd.subjectATotalByStudents(mark1));  // Total marks scored by students in subject A
        System.out.println(sd.subjectAAverageByStudents(mark1));   // Average marks scored by students in subject A
        System.out.println(sd.subjectBTotalByStudents(mark2));  // Total marks scored by students in subject B
        System.out.println(sd.subjectBAverageByStudents(mark2));  // Average marks scored by students in subject B
        System.out.println(sd.subjectCTotalByStudents(mark3));  // Total marks scored by students in subject C
        System.out.println(sd.subjectCAverageByStudents(mark3));  // Average marks scored by students in subject C
    }
    public int[] total(int[] mark1, int[] mark2, int[] mark3){
        int[] total = new int[3];
        for(int i=0;i<3;i++){
            total[i] = mark1[i]+mark2[i]+mark3[i];
        }
        return total;
    }

}
