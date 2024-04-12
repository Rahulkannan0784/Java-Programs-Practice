//Pass by Value Using Java Primitive Types
public class passbyvalue {
    public static void main(String args[]){
        int a=2;
        int b=3;
        add(2,3);
        System.out.println("main :"+(a+b));

    }
    private static void add(int a,int b){
        a= 10;
        System.out.println("method :"+a+b);
    }
}
