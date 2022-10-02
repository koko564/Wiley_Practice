import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AddSubTest {

	@Test
	public void testSorted() {
		List<Customer> actual=new ArrayList<Customer>();
		assertEquals("error in add()", 3, Calculator.add(1, 2));
		
		
	}
	//TDD: Test Driven Development : practice in Extreme Programming
	//Write Test-> Fail First->Write fully tested code 
	@Test
	public void testAvg() {
		
		assertEquals("error in add",5,Calculator.avg(new int[] {5,5,5}));
		assertEquals("error in add",7,Calculator.avg(new int[] {7,7,7}));
		
	}
	
}