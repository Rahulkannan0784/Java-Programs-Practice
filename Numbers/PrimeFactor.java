import java.util.Scanner;

public class PrimeFactor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Prime factors are ");
        primefactor(num);
    }
    public static void primefactor(int num){
        for (int i=2;i<=Math.sqrt(num);i++){
            while (num %i==0){
                System.out.println(i+" ");
                num /= i;  // Corrected line: divide num by i to reduce it
            }
        }
        if (num>1){
            System.out.println(num+" ");
        }
    }

}
