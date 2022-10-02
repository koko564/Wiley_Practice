package Recursion;
import java.util.*;
class MagicIndex {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Magic index: " + magicIndex(arr,0));
    }
    


    public static int magicIndex(int[] arr, int i) {
        if(i>arr.length-1)
        	return -1;
        else if(arr[i]==i)
        	return i;
        else
        	return magicIndex(arr, i+1);
        
    }

    
  
}