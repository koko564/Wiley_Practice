public class Arraydemo {

	public Arraydemo(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datatype[] arrayname=new datatype[sizeofarray]
		//arrays are created on heap, so arrays will always have default values. 
		
		int[] data=new int[] {10,54,23,54,12};
		data[0]=12;
		
		//never print array directly with name. it gives you the hash value for array. 
		//System.out.println(data);
		
		//using traditional loop
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		//using enhanced for loop
		//for(datatype element:array/collection)
		
		for(int value:data) {
			System.out.println(value);
			
		}
		
		//array creation of objects
		Arraydemo[] empArray=new Arraydemo[] {new Arraydemo(101,"John Doe"),new Arraydemo(102,"John Doe"),new Arraydemo(103,"John Doe")};
//		empArray[0]=new Employee(101,"John Doe");
//		empArray[1]=new Employee(102,"John Doe");
//		empArray[2]=new Employee(103,"John Doe");
		
		for(Arraydemo employee:empArray)
			System.out.println(employee);
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		

	