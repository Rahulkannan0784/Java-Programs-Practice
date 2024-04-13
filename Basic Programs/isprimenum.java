public class isprimenum {
    public static void maim(String args[]){

        int n=5;
        boolean isprime=true;
        for (int i=2;i<n+1;i++){
            if (n%i==0){
                isprime=false;
                break;

            }
        }
        if (isprime){
            System.out.println("Prime number");
        }
        else {
            System.out.println("not a prime");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        boolean isPrime = true;
//        int n = 5;
//
//        if (n < 2) {
//            isPrime = false;
//        } else {
//            int x = n / 2;
//            for (int i = 2; i <= x; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println("Number is a Prime Number");
//        } else {
//            System.out.println("Number is not a Prime Number");
//        }
//    }
//}
