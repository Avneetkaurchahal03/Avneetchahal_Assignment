import java.util.*;
import java.io.*;
import java.lang.*;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	  int n = arr.length;  
          int t = 0;  
           for(int i=0; i < n; i++){  
                   for(int j=1; j < (n-i); j++){  
                            if(arr[j-1] > arr[j]){  
                                   //swap elements  
                                   t = arr[j-1];  
                                   arr[j-1] = arr[j];  
                                   arr[j] = t;  
                                  
                           }  
                            
                   } 
                   
    
           }
           return arr;
           }

}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort b= new BubbleSort();
        int arr1[]= b.bubbleSort(arr);
        for(int i=0;i<arr1.length-1;i++) {
         
       System.out.println(arr[i]+"");}
    
    }
}
