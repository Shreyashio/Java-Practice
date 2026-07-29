package Sorting1;
public class Sorting1 {
    
    public static void sortNumbers(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            int minIndex = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After the selection sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,3,31,24,56,78,43,12};

        System.out.println("Before sorting: ");
        for(int num: arr) {
            System.out.print(num+ " ");
        }
        System.out.println();
        sortNumbers(arr);
    }
}
