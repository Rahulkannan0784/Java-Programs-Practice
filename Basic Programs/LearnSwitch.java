import java.util.Scanner;

public class LearnSwitch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        switch (n){
            case 1:
                System.out.println("entered 1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("not in case");
                break;

        }
    }
}
