
public class CountOccur {

	public static void main(String[] args) {
		
		String s="Hello World!";
		char ch='l';
		System.out.println("'"+ch+"'"+" occured "+countOccur(s,ch)+" times in "+s);
		}
	public static int  countOccur(String s, char ch) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch)
				c++;
		}
		return c;
		
	}
}
