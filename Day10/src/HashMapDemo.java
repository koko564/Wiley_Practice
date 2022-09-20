import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> myMap=new HashMap<String,String>();
		
		Map<String, List<String>> library=new HashMap<String, List<String>>();
		
		
		myMap.put("M1", "Koena");
		myMap.put("M2", "Srishti");
		myMap.put("M3", "Pratik");
		myMap.put("M4", "Prodzy");
		System.out.println(myMap);
		String name=myMap.get("M3");
		System.out.println(name);
		String s=myMap.getOrDefault("m5", "Default");
		System.out.println(s);
		System.out.println(myMap);
		Set<Entry<String, String>> mySet=myMap.entrySet();
		System.out.println(mySet);
	}
}
