import java.util.*;

public class MinMax1 {
	public static void main(String[] args) {
        int[] input={56,34,7,3,54,3,34,34,53};
        minMax obj= new minMax(Integer.MAX_VALUE,Integer.MIN_VALUE);
        minMax m =obj.min_max(input);
    }

}

class minMax
{
	int max;
    int min;
    public  minMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
   minMax  min_max(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       minMax obj= new minMax(min,max);
        return obj;
    }
    @Override
    public String toString(){
        return min+" "+max;
    }
}

