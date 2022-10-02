package Recursion;
import java.util.*;
class Survivor {
    public static int findTheWinner(int n, int k) {
        if (n==1)
            return 1;
        else
            return (findTheWinner(n-1,k) + k - 1) % n + 1;
    } 
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the no. of men: ");
    	int n=sc.nextInt();
    	System.out.println("Enter the kth position: ");
    	int k=sc.nextInt();
    	System.out.println("The position of the man survived: "+findTheWinner(n,k));
    }
}