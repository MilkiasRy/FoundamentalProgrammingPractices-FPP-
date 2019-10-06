package lab4_a3;

abstract class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	


	Account(Employee emp, double balance) {

		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}
	public abstract AccountTypes getAcctType();
	
 
	
    public double getBalance() {
    	return balance;
    }
	
	
	public boolean makeDeposit(double deposit) {
		if(deposit>0) {
		balance+=deposit;
		return true;
		}
		return false;
	}

	public boolean makeWithdrawal(double amount) {
		
		if(amount<=balance)
		{
			balance-=amount;
			return true;
		}
		return false;
	}

	
}
