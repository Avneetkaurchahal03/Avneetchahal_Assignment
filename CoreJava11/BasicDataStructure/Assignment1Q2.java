import java.util.*;

public class Assignment1Q2 {
	public static void main(String [] args){
		
		
		int min = 100;int max = 999;
		ArmstrongNumBetweenRange a= new ArmstrongNumBetweenRange();
		System.out.println(a.armstrongNumbersInRange(min, max));
	
		}	
	}
			


class ArmstrongNumBetweenRange{
	
    public int[] armstrongNumbersInRange(int min , int max){
    	int n,remainder,m,sum;
     
        List<Integer> a= new ArrayList<>();
        for(int i=min;i<=max;i++){
            n=i;
            m = n;sum=0;
            while(n!=0){
                remainder = n%10;
                n = n/10;
                sum = sum + remainder*remainder*remainder;
            }
            if(sum==m){
                a.add(sum);
            }
        }
        
        System.out.println(a);
        return new int[0];
}
}

    		