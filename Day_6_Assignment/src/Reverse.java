
public class Reverse {

	public static void main(String[] args) {
		
		String s="Hello World!";
		
		// Using String Builder
		
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1.reverse();
		s1.toString();
		System.out.println("Reverse using StringBuilder : "+s1+'\n');
		
		//Using CharAt
		String s2 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println("Reverse manually: "+s2);

	}

}
