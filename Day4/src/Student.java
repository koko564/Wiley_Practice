
public class Student {
	int studentRegNo;
	String Name;
	Date Doa;
	
	public Student(int studentRegNo,String Name, Date Doa ) {
		this.studentRegNo=studentRegNo;
		this.Name=Name;
		this.Doa=Doa;
	}
	public void display() {
		System.out.println(this.studentRegNo+" , "+this.Name+" , "+Doa.displayDate());
		
		}
	public static void main(String[] args) {
		Date date=new Date(9,9,2022);
		if (date.checkVal()==true) {
		Student st=new Student(1001,"koko",date);
		st.display();
		}
		else
			System.out.println("Invalid Date");
		
	}
	
}
