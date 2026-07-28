package Arrays;
import java.util.*;

public class ArraysExample{
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest<numbers[i]){
                largest = numbers[i];
            } 
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        // return largest;
        return smallest;
    }
    public static void main (String args[]){
        int numbers[] = {1,2,5,3,7,6,8,9};
        int smallestNum = getLargest(numbers);

        System.out.println("The smallest number in the array is : "+ smallestNum);


    }
}