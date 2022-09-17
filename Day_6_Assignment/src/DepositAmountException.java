public class DepositAmountException extends RuntimeException{
	String message;
	DepositAmountException(){
		message="DepositAmountException Occured";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Amount needs to be Positive";
	}

}