public enum AccountType {
	SAVINGS(5), CURRENT(8);
	private int rate;
	AccountType(int rate){
		this.rate=rate;
	}
	int interestRate() {
		return this.rate;
	}
	
	
}