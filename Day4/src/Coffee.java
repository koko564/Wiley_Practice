
public enum Coffee {
	NESCAFE(5), LATTE(7), CAPUCCINO(10), ESPRESSO(9) ;
	private int coffeebeans;
	
	private Coffee(int coffeebeans){
		this.coffeebeans=coffeebeans;
	}
	public void prepareCoffee() {
		System.out.println("Coffee bann raha hai");
	}
	public double calculatePrice() {
		return this.coffeebeans*20;
	}
}

