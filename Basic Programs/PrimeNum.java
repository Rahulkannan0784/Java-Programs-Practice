public class PrimeNum {
    public static void main(String args[]){
        int count =0;
        int N=5;
        for (int i=1;i<N+1;i++){
            if (N%i==0) {
                count += 1;
            }
        }
        if (count>2){
            System.out.println("Not a prime");
        }
        else {
            System.out.println(N +" :is prime");
        }

    }
}

//Algorithm 2

//public class Main {
//    public static void main(String[] args) {
//        int count = 0, n = 5;
//        for (int i = 1; i < n + 1; i++) {
//            if (n % i == 0) {
//                count += 1;
//            }
//        }
//        if (n == 0 || n == 1) {
//            System.out.printf("%d is not a Prime Number", n);
//        } else if (count > 2) {
//            System.out.printf("%d is not a Prime Number", n);
//        } else {
//            System.out.printf("%d is a Prime Number", n);
//        }
//    }
//}
