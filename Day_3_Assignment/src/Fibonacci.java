
public class Fibonacci {
		int start,end;
		
		public Fibonacci(int s, int e) {
			this.start=s;
			this.end=e;
		}
		public void printFib() {
			int f1 = 0, f2 = 1, f3 = 1;
			 while (f1 <= end) {
	            if (f1 >= start)
	            System.out.print(f1+" ");
	            f1 = f2;
	            f2 = f3;
	            f3 = f1 + f2;
	        }
	 
		}
		
	public static void main(String[] args) {
		Fibonacci obj=new Fibonacci(10,100);
		if(obj.start>obj.end)
		System.out.println("Check input again, invalid start and end");	
		obj.printFib();
			
	}

}
