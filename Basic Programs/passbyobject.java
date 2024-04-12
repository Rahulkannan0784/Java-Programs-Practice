public class passbyobject {
    public static void main(String args[]){
        Integer a=2;
        Integer b=3;
        add(2,3);
        System.out.println("main :"+(a+b));
    }
    private static void add(Integer a,Integer b){
        a=10;
        System.out.println("method :"+(a+b));
    }
}
