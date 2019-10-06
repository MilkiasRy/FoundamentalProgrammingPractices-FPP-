package lab5_3Collected;

import java.util.*;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,
				monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}
	
	public Date getHireDate() {
		return (Date) hireDate.clone();
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVING, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		;
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {

		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVING:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);

		}

	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		boolean temp = false; 
		switch (acctType) {

		case CHECKING:
			temp = checkingAcct.makeWithdrawal(amt);
			break;
		case SAVING:
			temp = savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			temp = retirementAcct.makeWithdrawal(amt);

		}
		return temp;
	}

	public String getFormattedAcctInfo() {
		// implement

		String str = String.format("%s%s%n%n%s%n%s%.1f%n%s%n%s%.1f",
				"ACCOUNT INFO FOR ", name, "Account type: checking",
				"Current bal   ", checkingAcct.getBalance(),
				"Account type: savings", "Current bal   ", savingsAcct
						.getBalance());

		if (retirementAcct != null) {
			str += String.format("%n%s%n%s%.1f", "Account type: retirement",
					"Current bal   ", retirementAcct.getBalance());
		}

		str += "\n";

		return str;
	}

}
