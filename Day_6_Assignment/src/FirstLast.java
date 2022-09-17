public class FirstLast {
 public static void main(String[] args)
 {
    int[] Array1 = {33, 30, 21, -99, -213, 709, 430};
    int[] Array2 = {33, 30, 21, -99, -213, 709, 33};
    check(Array1);
    check(Array2);
	
 }
 public static void check(int[] num) {
	 if (num.length >= 5 && num[0] ==  num[num.length-1])
		 System.out.println("Same last elements!\n");
	 else
		 System.out.println("Not same last elements!\n");
 }
}