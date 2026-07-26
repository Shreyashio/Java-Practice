// Greatest of three numbers

// public class Conditional {
//     public static void main(String args[]) {
//         int A = 15;
//         int B = 13;
//         int C = 14;

//         if(A>B && A>C) {
//             System.out.println("A is the greatest number");
//         }
//         else if(B>A && B>C) {
//             System.out.println("B is the greatest number");
//         }
//         else{
//             System.out.println("C is the greatest number");
//         }
//     } 
// }


// Odd Even

// public class Conditional {
//     public static void main(String args[]) {
//         int A = 16;

//         if(A%2 == 0) {
//             System.out.println("The number A is Even");
//         }
//         else{
//             System.out.println("The number A is Odd");
//         }
//     } 
// }

//  Tax calculator

import java.util.*;

// public class Conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000) {
//             tax = 0;
//         }
//         else if(income >= 500000) {
//             tax = (int) (income*0.2);
//         }
//         else {
//             tax = (int) (income*0.3);
//         }

//         System.out.println("Your Tax is : " + tax);
//     }
// }

//  Result

// public class Conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int marks = sc.nextInt();

//         String result = (marks>=33)? "Pass" : "Fail";
//         System.out.println(result);

//     }
// }

//  Switch Statement

// public class Conditional {
//     public static void main(String args[]) {
//         int number = 5;

//         switch(number) {
//             case 1 : System.out.println("Can I get a Hoyyaaa");
//                         break;
//             case 2 : System.out.println("Hey Girll");
//                         break;
//             case 3 : System.out.println("Howw you doinn");
//                         break;
//             default : System.out.println("Don't Daydream boyy");
//         }

//     }
// }

//  Calculator 

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter Operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;

            default : System.out.println("wrong operator");
            
        }

    }
}
