
public enum AccountType {
	SAVINGS(500), CURRENT(1000);
	private int minBal;
	AccountType(int minBal){
		this.minBal=minBal;
	}
	int minimumBal() {
		return this.minBal;
	}
	
	
}

