import java.util.*;

public class ArraysExample{
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main (String args[]){
        int numbers[] = {1,2,5,3,7,6,8,9};
        int largestNum = getLargest(numbers);

        System.out.println("The largest number in the array is : "+ largestNum);


    }
}