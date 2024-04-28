public class HCF {
    public static void main(String args[]){
        int num=36;
        int num2=60;
        while (num!=num2){
            if (num>num2){
                num-=num2;
            }
            else {
                num2-=num;
            }
        }
        System.out.println(num);
    }
}
