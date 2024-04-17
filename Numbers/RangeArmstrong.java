import java.util.Scanner;

public class RangeArmstrong {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int low= sc.nextInt();
        int high= sc.nextInt();
        System.out.println("Aromstrong between your range are");
        armstrong(low,high);
    }
    public static int order(int num){
        int len=0;
        while (num!=0){
            len++;
            num=num/10;
        }
        return len;
    }

    public static void armstrong(int low,int high){
        int count=0;
        for (int num=low;num<=high;num++){
            int sum=0,temp,digit,len;
            temp=num;
            len=order(num);
            while (temp!=0){
                digit =temp%10;
                sum+=Math.pow(digit,len);
                temp/=10;
            }
            if (sum==num){
                System.out.println(num +" ");
                count++;
            }
        }
        if(count==0){
            System.out.println("given range does not");
        }
    }
}
