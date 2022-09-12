//Constructor calling
public class Employee {
 int empId;
 String empName;
 
 public Employee() {
	 System.out.println("Default constructor is invoked");
 }
 

 public Employee (int empId, String empName) {
	 this();
	 this.empId=empId;
	 this.empName=empName;
	 System.out.println("Parameterized constructor is invoked");
 }
 public Employee(int empId) {
	 
	 System.out.println("Parameter constructor is invoked");
 }
 public void display() {
	 System.out.println(this.empId+","+this.empName);

 }
 public static void main(String[] args) {
	 Employee e=new Employee(90);
	 Employee e1=new Employee(101,"koko");
	 e1.display();
 }
 }
 
