
public class Date {
int dd,mm,yy;

public Date(int dd,int mm,int yy) {
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
public String displayDate() {
	return (dd+"."+mm+"."+yy);
}
public boolean checkVal() {
	if(this.dd>31 || this.mm>12 || this.yy>2022)
		return false;
	return true;
	}
}
