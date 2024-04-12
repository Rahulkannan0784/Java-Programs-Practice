import java.util.Scanner;

public class Greatertwo {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        if (a==b){
            System.out.println("equal");
        }
        else {
            System.out.println("max num is "+Math.max(a,b));
        }
    }
}

//import java.util.Scanner;
//public class LearnCoding
//{
//    public static void main(String[] args) {
//        //scanner class declaration
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the two numbers");
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//
//        int largest = 0;
//
//        //conditions
//        if(num1 == num2)
//            System.out.println("Both numbers are equal");
//        else
//            largest = (num1 > num2) ? num1 : num2;
//
//
//        System.out.println(largest + " is the largest");
//
//        //closing scanner class(not compulsory, but good practice)
//        sc.close();
//    }
//}