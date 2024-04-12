//Write a program to print all numbers between two intervals, namely low and high.
// But, with a special condition that if any number in the range while getting printed becomes divisible by 13 then
// you must not print anything further and stop. (Do this using the Break Statement)
import java.util.Scanner;
public class Learnbreak {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int low= sc.nextInt();
        int high =sc.nextInt();
        int i=low;
        while (i<=high) {
            System.out.print(i + " ");
            if (i % 13 == 0) {
                break;
            }
            i++;
        }
    }
}


