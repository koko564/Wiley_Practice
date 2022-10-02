package Recursion;
import java.util.*;
public class Stairs {
 
 
    public static int stepsNeeded(int n)
    {
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;
 
        else
            return stepsNeeded(n - 3) + stepsNeeded(n - 2)
                + stepsNeeded(n - 1);
    }
 
 
    public static void main(String argc[])
    {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ways of step combination: "+stepsNeeded(n));
    }
}
 