import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
	
	public static void processIt() {
		try {
			
			int d=100/0;
		}
		catch( ArithmeticException | ArrayIndexOutOfBoundsException  e) {
		
			if(e instanceof ArithmeticException ) {
				System.out.println("Arith");
			}
			else {
				System.out.println("Common");
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		processIt();		
	}

}