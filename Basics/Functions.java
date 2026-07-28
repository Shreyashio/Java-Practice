import java.util.*;

public class Functions {
    public static void printHelloWorld() {
        
    }

    public static void calculateSum(int a, int b) {
        int sum = a+b;
        System.out.println("the Sum is : " + sum);
    }

    public static void swap(int a, int b){
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }    

    public static int binomialCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
         
        int binomialCoeff = fact_n/(fact_r * fact_nmr);
        return binomialCoeff;
    }

    // function to find int sum
    public static int sum(int a, int b) {
        return a+b; 
    }

    //  function to find float sum
    public static float sum(float a, float b) {
        return a+b;
    }
    
    // Prime numbers
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Primes in Range 
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
                System.out.print(i+",");
            }
        }
        System.out.println();
    }

    // Binary to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimal " + myNum + " is = " + decNum);
    }

    // Decimal to binary
    public static void decToBin(int decNum){
        int myDec = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;

        }
        System.out.print("The binary form of this number "+ myDec + " is " + binNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // binToDec(111);

        decToBin(8);

    }
}