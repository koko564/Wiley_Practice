import java.util.Objects;
public class Employee{
	int empId;
	double  empBasicSalary, empGrossSalary;
	String empName, empDept;
	public Employee(int empId, double empBasicSalary, 	String empName, String empDept ) {
		this.empId=empId;
		this.empBasicSalary=empBasicSalary;
		this.empName=empName;
		this.empDept=empDept;
		this.empGrossSalary=calculateGrossSalary();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(empId,empName);
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public void setEmpGrossSalary(double empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())  //checking class type
			return false;
		Employee obj2=(Employee) obj; //casting
		return empId==obj2.empId && Objects.equals(empName, obj2.empName);
	}

	@Override
	public String toString() {
		String s="Id: "+empId+"\nName: "+empName+"\nDepartment: "+empDept+"\nBasic Salary: "+empBasicSalary+"\nGross Salary: "+empGrossSalary+'\n';
		return s;
	}

	public double calculateGrossSalary() {
		double HRA=0.12*this.empBasicSalary;
		double DA=.08*this.empBasicSalary;
		
		return this.empBasicSalary+HRA+DA;
	}
	
}
	
	
	
	


