public class Statements {
	public int addSub(int a, int b, int c) {
		if (c==1)
			return a+b;
		else
			return a-b;
				
	}
	public int sumOfDig(int num) {
		int sum=0;
		while(num>0) {
		int d=num%10;
		sum=sum+d;
		num=num/10;
	}
	return sum;
	}
	
	public void check() {
		for (int i = 1; i <= 10; ++i) {

		      
		      if (i > 4 && i < 9) {
		        continue;
		      }
		      System.out.println(i);
		}
	}
	public void printTillFive() {
		for (int i = 1; i <= 10; ++i) {
			if (i == 5) {
                break;
            }      
            System.out.println(i);
        }   
    }
	public void doWhile() {
		 int i = 0;
		 
	        do {
	 System.out.println("Yes");
	            i++;
	        }
	 
	        while (i < 0);
	    }
	
	public void switchCase(int n) {
		
		switch (n) {
		  case 1:
		    System.out.println("Rose");
		    break;
		  case 2:
		    System.out.println("Tulip");
		    break;
		  case 3:
		    System.out.println("Marigold");
		    break;
		  case 4:
		    System.out.println("Lily");
		    break;
		  case 5:
		    System.out.println("Lotus");
		    break;
		  default:
			  System.out.println("Invalid Choice");
		}
	}
	public static void main(String[] args) {
		Statements obj = new Statements();
		int ans=obj.addSub(30, 15, 1);
		System.out.println(ans);
		int sum=obj.sumOfDig(3000);
		System.out.println(sum);
		obj.check();
		obj.printTillFive();
		obj.doWhile();
		obj.switchCase(2);
		
		

	}

}