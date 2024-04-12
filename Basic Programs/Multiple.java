import java.util.Scanner;

public class Multiple {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        mul(n);

    }
    static void mul(int n){
        int i;
        for(i=1;i<=10;i++){
            System.out.println(n +"*" + i + "=" + n*i);

        }
    }
}
