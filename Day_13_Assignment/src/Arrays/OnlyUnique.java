package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class OnlyUnique {
	
	public static boolean unique(String str) {
		HashSet<Character> char_set = new HashSet<>();
		int count=0;
	    for(int c  = 0; c< str.length();c++)
	    {
	        if(str.charAt(c)!=' ') 
	        	char_set.add(str.charAt(c));
	        else
	        	count++;	    }
	 
	    // If length of set is equal to len of String
	    // then it will have unique characters
	    return char_set.size() == str.length()-count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if (unique(s)==true)
			System.out.println("Unique String");
		else
			System.out.println("Not Unique String");
	}
}
