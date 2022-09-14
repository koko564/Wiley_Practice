
public class SetringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is immutable object.
		//First class object behaves like primitives, no need of new keyword.
		String s1="something";// new object created s1 referring to it
		System.out.println(s1 );
		s1="nothing";// another object created s1 referring to it now, previous one is eligible for garbage collection.
		System.out.println(s1 );
		
		// demo 2
		String s2=new String("java"); // creating a new object using new keyword
		String s3="java";
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
/*
* In JVM memory there is compartment 
*
*/
		
		
	}

}
