public class BankAccount {
	AccountType type1=AccountType.SAVINGS;
	AccountType type2=AccountType.CURRENT;
	String accountId, holderName, accType;
	double openBal, currentBal;
	boolean valid;
	static double totalBal;
	static {
		
		totalBal=0;
	}
	public BankAccount(String accountId,String holderName,double openBal, String accType) {
		this.holderName=holderName;
		this.accType=accType;
		
		if((accType.equals("SAVINGS") && openBal>=type1.minimumBal()) || (accType.equals("CURRENT") && openBal>=type2.minimumBal())){
		valid=true;
		this.accountId=accountId;
		this.openBal=openBal;
		this.currentBal=openBal;
		totalBal=totalBal+currentBal;
		System.out.println("Account Created for "+holderName+" under Id "+accountId+". \n");
		
	}
		else
			System.out.println("Account Not created for "+holderName+" Due to insufficient Opening Balance! \n");
	}
	public void depositAmount(double amount) {
		if (valid) {
		System.out.println("Amount deposited!");
		currentBal=currentBal+amount;
		totalBal=totalBal+amount;
		System.out.println("ID:"+accountId);
		System.out.println("Name:"+holderName);
		System.out.println("Opening Balance:"+openBal);
		getCurrentBalance();
		}
		else
			System.out.println("Failed to Deposit : Account doesn't exist! \n");
	}
	public void withdrawAmount(double amount) {
		if(valid) {
			if((accType.equals("SAVINGS") && (currentBal-amount)>=type1.minimumBal()) || (accType.equals("CURRENT") && (currentBal-amount)>=type2.minimumBal())) {
			System.out.println("Amount withdrawn!");
			currentBal=currentBal-amount;
			totalBal=totalBal-amount;
		}
		
		else
			System.out.println("Invalid withdraw amount!");
			System.out.println("ID:"+accountId);
			System.out.println("Name:"+holderName);
			System.out.println("Opening Balance:"+openBal);
			getCurrentBalance();
	}
		else
			System.out.println("Failed to Withdraw : Account doesn't exist! \n");
	}
	
	public static void displayTotalBalance()
	{
		System.out.println("Total Cash in Bank : "+totalBal);
	}
	
	public void getCurrentBalance() {
		System.out.println("Current Balance:"+currentBal+'\n');
		
		
	}
	
	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("ABC123","Rakesh Sen",900,"SAVINGS");
		BankAccount obj2=new BankAccount("DEF123","Priya Ray",8000,"CURRENT");
		BankAccount obj3=new BankAccount("GHI123","Rajnish Kumar Singh",800,"CURRENT");
		BankAccount obj4=new BankAccount("JKL123","Riya Dey",6500,"SAVINGS");
		BankAccount obj5=new BankAccount("MNO123","Tina Singh",300,"SAVINGS");
		obj1.depositAmount(1200);
		obj5.withdrawAmount(200);
		obj2.withdrawAmount(7900);
		obj4.depositAmount(3500);
		obj3.depositAmount(1000);
	
		
		BankAccount.displayTotalBalance();
		
		
	}

}