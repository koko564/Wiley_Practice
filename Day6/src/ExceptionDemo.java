import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		doCalculation();
		processFile("hello.txt");
		}
		catch(Exception ae) {
			System.out.println("Error in File");
			
		}
		
	}

	//unchecked exceptions and throws
	private static void doCalculation() throws ArithmeticException{
		// TODO Auto-generated method stub
		
	}

	
	//throws keyword used with checked exceptions
	private static void processFile(String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(fileName);
	}
	
	

	

}