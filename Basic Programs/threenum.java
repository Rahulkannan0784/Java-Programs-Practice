import java.util.Scanner;

public class threenum{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int result;
        result=Math.max(a,Math.max(b,c));
        System.out.println(result);
    }
}
