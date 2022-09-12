public class Employee {
	int empId;
	String empName;
	public void displayEmployee() {
		System.out.println(empId+","+empName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.displayEmployee();
	}

}