import java.lang.Math;
import java.util.*;
class Root
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt ();


        System.out.println ("The square root of " + x + " is : " + SquareRoot (x));
        int y = sc.nextInt ();
        System.out.println ("The cube root of " + y + " is : " + CubeRoot (y));


    }
    static double SquareRoot(int x)
    {
        double sq;
        sq = Math.sqrt(x);
        return sq;
    }
    static double CubeRoot(int x)
    {
        double cb;
        cb = Math.cbrt(x);
        return cb;
    }
}
