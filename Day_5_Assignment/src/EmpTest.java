import java.util.Arrays;
import java.util.Comparator;

public class EmpTest {
	public static void main(String[] args) {
		Employee[] empArray=new Employee[] {new Employee(101,15000,"John Doe","Marketing"),
											new Employee(102,18000,"Riya Sen","IT support"),
											new Employee(103,10000,"Sam Heggs","Marketing"),
											new Employee(104,12000,"Jennie Jetkins","Content Review"),
											new Employee(105,19000,"Daniel Figg","Marketing")};
		
	SortEmployee(empArray);
	System.out.println("Sorted Employees according to Salary:");
	for(int i=0;i<empArray.length;i++) 
		System.out.println(empArray[i]);
	
	
	System.out.println("\nEmployees in Marketing Department :");
	searchEmployees(empArray,"Marketing");
	
	Employee emp1=new Employee(301,15000,"Riya Basu","Marketing");
	Employee emp2=new Employee(301,15000,"Riya Basu","Marketing");
	
	System.out.println("\nEmployees equality Check :");
	if(emp1.equals(emp2))
		System.out.println("Same employees");
	else
		System.out.println("Not Same employees");
	
}
	public static void SortEmployee(Employee empArray[]) {
		Arrays.sort(empArray, new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				if(e1.getEmpBasicSalary()<e2.getEmpBasicSalary())
					return -1;
				return 1;
			}
		});
	}
	public static void searchEmployees(Employee empArray[],String Dept) {
	for(int i=0;i<empArray.length;i++) {
		if(empArray[i].getEmpDept().equals(Dept)) {
			System.out.println(empArray[i]);
			}
			
		}
		
	}
}
	
	
