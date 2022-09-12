
public class CoffeeDemo {
	public static void main(String[] args) {
		Coffee coffee=Coffee.CAPUCCINO;
		System.out.println(coffee);
		coffee.prepareCoffee();
		System.out.println("Ur bill :"+coffee.calculatePrice());
	}
}
