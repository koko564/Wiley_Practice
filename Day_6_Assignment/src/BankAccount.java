public class BankAccount {
	AccountType type1=AccountType.SAVINGS;
	AccountType type2=AccountType.CURRENT;
	String accountId, holderName, accType;
	
	public BankAccount(String accountId,String holderName, String accType) {
		this.holderName=holderName;
		this.accType=accType;
		this.accountId=accountId;
	}
		
	public void calculateTotalInterest (double amount, int years) {
		double interest;
		if(amount<0)
			throw new DepositAmountException();
		else {
		
			if(this.accType.equals("SAVINGS"))
			  interest = (amount*type1.interestRate()*years)/100;
			else
				interest = (amount*type2.interestRate()*years)/100;
		}
		System.out.println("Interest calculated for "+holderName+" is : "+interest+'\n');
			
	}
	
	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("ABC123","Rakesh Sen","SAVINGS");
		BankAccount obj2=new BankAccount("DEF123","Priya Ray","CURRENT");
		BankAccount obj3=new BankAccount("GHI123","Rajnish Kumar Singh","CURRENT");
		try {
			obj1.calculateTotalInterest(-999,2);
			}
		catch(DepositAmountException de) {
			System.out.println(de+" for "+obj1.holderName+'\n');
		}
		obj2.calculateTotalInterest(5000,2);
		
		
	}

}