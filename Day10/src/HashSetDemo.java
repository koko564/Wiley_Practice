import java.util.HashSet;
import java.util.Set;


//capacity of collections : Default is 10
//load factor of collections : Default is 0.75


public class HashSetDemo {
     public static void main(String[] args) {
    	 Set<Integer> numbers= new HashSet<Integer>();
    	 // unique and unordered
    	 numbers.add(66);
    	 numbers.add(32);
    	 numbers.add(78);
    	 numbers.add(null);
    	 numbers.add(89);
    	 numbers.add(null);
    	 numbers.add(32); // duplicate will be removed
    	// numbers.add("ji");
    	 
    	System.out.println(numbers); //printing all the elements
    	
    	
}
}
