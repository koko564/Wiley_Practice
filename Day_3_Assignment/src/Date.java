
public class Date {
   int dd,mm,yy;
   
   public Date(int d,int m, int y) {
	   this.dd=d;
	   this.mm=m;
	   this.yy=y;
	   
   }
   public boolean checkDate() {
	   if(dd>31 || mm>12) {
		   return true;
	   }
	   return false;
	   
   }
   public void displayDate() {
	   System.out.println("Date: "+dd+"-"+mm+"-"+yy);
   }
   
	public static void main(String[] args) {
		Date obj=new Date(8,4,2001);
		if(obj.checkDate())
		System.out.println("Invalid date provided!!");
		else
		obj.displayDate();

	}

}
