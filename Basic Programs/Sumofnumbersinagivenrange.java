public class Sumofnumbersinagivenrange {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
            System.out.println(sum);
        }

    }
}


//Algorithm 2
//public class Main {
//    public static void main(String[] args) {
//        int a = 10, b = 20;
//        int sum = b * (b + 1) / 2 - a * (a + 1) / 2 + a;
//        System.out.print(sum);
//    }
//}
