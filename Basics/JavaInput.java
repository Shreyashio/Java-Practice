import java.util.*;

// Sum of two nubers using input

public class JavaInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Please enter the value of b: ");
        int b = sc.nextInt();

        int product = a*b;
        System.out.println(product);

    }
}