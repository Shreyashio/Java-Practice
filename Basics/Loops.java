import java.util.*;

// public class Loops {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;

//         while(counter<=n) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }



// public class Loops {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;

//         while(i<=n) {
//             sum +=i; 
//             i++;
//         }
//         System.out.println(sum);
//     }
// }



// public class Loops {
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++) {
            
//         }
        
//     }
// }


// print reverse of a number 
// public class Loops {
//     public static void main(String args[]){
//         int n = 20606;

//         while(n>0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;
//         }
//         System.out.println();
//     }
// }



// Print prime or not

// public class Loops {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         if(n == 2) {
//             System.out.println("n is a prime number");
//         }
//         else {
//             boolean isPrime = true;
//         for(int i = 2; i <= n-1; i++) {
//             if(n % i == 0){
//                 isPrime = false;
//             }
//         }

//         if(isPrime == true) {
//             System.out.println("n is a prime number");
//         } else {
//             System.out.println("n is not prime");
//         }
//         }
//     }
// }


//  Print star pattern


// public class Loops {
//     public static void main(String args[]){
//         int n = 9;
//         for(int line=1; line <= n; line++ ){
//             for(int star=1; star<=(n-line+1); star++){
//                 System.out.print("*");
//         }
//                 System.out.println();
//         }   
//     }
// }

// print number pattern
// 1
// 12
// 123
// 1234

// public class Loops {
//     public static void main(String args[]){
//         int n = 5;
//         for(int line=1; line <= n; line++ ){
//             for(int number=1; number<= line; number++){
//                 // print numbers
//                 System.out.print(number);
//         }
//                 System.out.println();
//         }   
//     }
// }



// Print characters
// A 
// BC
// DEF
// GHIJ

public class Loops {
    public static void main(String args[]){
        int n = 5;
        char ch = 'A';
        for(int line=1; line <= n; line++ ){
            for(int chars=1; chars<= line; chars++){
                // print numbers
                System.out.print(ch);
                ch++;
        }
                System.out.println();
        }   
    }
}