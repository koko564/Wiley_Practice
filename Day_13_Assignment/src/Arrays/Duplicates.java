package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Duplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(dupeList(arr));
		System.out.println(dupeManual(arr));
		System.out.println(dupeStream(arr));
	}
	public static boolean dupeList(Integer[] arr) {
		 Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		 if(set.size() != arr.length)
			 return true;
		 else
			 return false;
	}
	public static boolean dupeManual(Integer[] arr) {
		for (int i = 0; i < arr.length; i++)
	    {
	        for (int j = i + 1; j < arr.length; j++)
	        {
	            if (arr[i] != null && arr[i].equals(arr[j])) {
	                return true;
	            }
	        }
	    }
	 
	 return false;
	}
	public static boolean dupeStream(Integer[] arr) {
		Long distinctCount = Stream.of(arr).distinct().count();
	    return arr.length != distinctCount;
	}
}
