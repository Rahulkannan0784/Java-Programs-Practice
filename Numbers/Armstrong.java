import java.util.Scanner;

public class Armstrong {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int len=order(num);
        if(armstrong(num,len)){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not a Armstrong");
        }

    }
    public static int order(int num){
        int len=0;
        while(num!=0){
            len++;
            num=num/10;
        }
        return len;
    }
    public static boolean armstrong(int num,int len){
        int sum=0;
        int temp=num;
        while (temp!=0){
            int digit =temp%10;
            sum+=Math.pow(digit,len);
            temp/=10;
        }
        return (sum==num);
    }
}
