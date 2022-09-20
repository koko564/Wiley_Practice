import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

//capacity of collections : Default is 10
//load factor of collections : Default is 0.75


public class ArrayListDemo {
     public static void main(String[] args) {
    	 ArrayList<Integer> numbers= new ArrayList<Integer>();
    	 // ArrayList : AbstractArrayList, Collection, Object, List, AbstractColllections
    	 numbers.add(67);
    	 numbers.add(66);
    	 numbers.add(32);
    	 numbers.add(78);
    	 numbers.add(89);
    	// numbers.add("ji");
    	 
    	System.out.println(numbers); //printing all the elements
    	
    	numbers.add(3, 100); 
    	System.out.println(numbers);
    	
    	ArrayList<Integer> numbers1= new ArrayList<Integer>();
    	numbers1.add(99);
    	numbers1.add(99);
    	numbers1.add(99);
    	numbers1.add(99);
    	numbers.addAll(numbers1);
    	System.out.println(numbers);
    	System.out.println(numbers.get(4));
    	numbers.remove(new Integer(32));
    	System.out.println(numbers);
    	
    	// for printing
    	//traditional for loop 
    	for(int i=0;i<numbers.size();i++)
    		System.out.println(numbers.get(i));
    	
    	//for each
    	for(Integer num : numbers)
    		System.out.println(num);
    	
    	// iterator : moves only forawrd
    	Iterator<Integer> numberIterator=numbers.iterator();
    	while(numberIterator.hasNext()) {
    		int data=numberIterator.next().intValue();
    		System.out.println(data);
    		numberIterator.remove(); //removes all elements  unless given condition
    	}
    		
    	ListIterator<Integer> myListIterator=numbers.listIterator(); // can move bidirectional
    	
    	
}
}
