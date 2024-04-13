//import java.util.Scanner;
//
//public class PrimeSqrt {
//    public static void main(String[] args) {
//        boolean isPrime = true;
//        int n = 5;
//
//        if (n < 2) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println("Number is a Prime Number");
//        } else {
//            System.out.println("Number is not a Prime Number");
//        }
//    }
//}

import java.util.Scanner;

public class PrimeSqrt {
    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        // Negative numbers are not prime
        if (n <= 1)
            return false;
            // Special case: 2 is the only even number that is prime
        else if (n == 2)
            return true;
            // Check if n is a multiple of 2, so it won't be prime
        else if (n % 2 == 0)
            return false;
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.printf("%d is a prime number.%n", number);
        } else {
            System.out.printf("%d is not a prime number.%n", number);
        }
    }
}

