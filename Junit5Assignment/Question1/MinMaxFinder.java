import java .util.*;
public class MinMaxFinder {
	public static void main(String[] args) {
        int[] arr={56,34,7,3,54,3,34,34,53};
        int[] arr1=findminmax(arr);
        Arrays.stream(arr1).forEach(System.out::println);
    }
    public static int[] findminmax(int[] arr){
        int[] output={Integer.MAX_VALUE,Integer.MIN_VALUE};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>output[1]){
                output[1]=arr[i];
            }
            if(arr[i]<output[0]){
                output[0]=arr[i];
            }
        }
        return output;
    }
}

