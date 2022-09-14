//exception : Abrupt termination
//if else traditional way
// Object --> Throwable --> Exception, error
//Exception --> RunTimeException, IOException


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {10,0};
		//reading array elements happen at runtime
		int value,value1;
		int add,sub,div,mul;
		try {
		value=data[0];
		value1=data[1];
		add=value+value1;
		System.out.println("Add="+add);
		sub=value-value1;
		System.out.println("Sub="+sub);
		try
		{
		div=value/value1;
		System.out.println("Div="+div);
		}
		catch(ArithmeticException se) {
		System.out.println("Cannot divide by zero");
		}
		
		mul=value*value1;
		System.out.println("Mul="+mul);
		}
		
		
		catch(ArrayIndexOutOfBoundsException se) {
			System.out.println("2 elements needed");
			
		}
		
	}

}
