package lab5_3Collected;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (balance > amount) {
			balance -= amount;
			return true;
		}

		return false;

	}

	// accessor
	public AccountType getAccountType() {
		return acctType;
	}

	public double getBalance() {
		return balance;
	}

}
