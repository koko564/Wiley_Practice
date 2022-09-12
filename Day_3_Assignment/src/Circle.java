
public class Circle {
        double radius,area;
        public Circle(double r) {
        	this.radius=r;
        }
        public void calculateArea() {
        	this.area=3.14*radius*radius;
        	System.out.println("Area: "+area);
        }
        public static void main(String[] args) {
        	Circle obj=new Circle(5);
        	obj.calculateArea();
        }
}
