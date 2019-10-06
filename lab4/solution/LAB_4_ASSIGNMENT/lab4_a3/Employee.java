package lab4_a3;

 import java.time.LocalDate;

import lab4_a3.MyStringList;

 public class Employee {

	private AccountList accounts = new AccountList();
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int year, int month, int day) {
		this.name = name;
		hireDate = LocalDate.of(year, month, day);
	}

	public void createNewChecking(double sAmount) {
		Account acnt = new CheckingAccount(this, sAmount);
		accounts.add(acnt);
	}

	public void createNewSavings(double sAmount) {
		Account acnt = new SavingsAccount(this, sAmount);
		accounts.add(acnt);
	}

	public void createNewRetirement(double sAmount) {
		Account acnt= new RetirementAccount(this, sAmount);
		accounts.add(acnt);
	}

	public String getFormattedAcctInfo() {

		String info = "ACCOUNT INFO FOR: " + name + "\n";

		return info + this.getNamesOfAccounts();

	}

	public String getName() {
		return name;

	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	

	public void deposit(int accountIndex, double amt) {

		Account selected = accounts.get(accountIndex);
		if (selected != null) {
			if (selected.makeDeposit(amt))
				System.out.format(" $%.2f %2s %2s %2s %2s %n", amt,"has been deposited in the ", selected.getAcctType(),
						" account of ",getName());
		}
		else {
			System.out.println("Incorrect amount, Try with correct amount, Bye."	);
		}
	}

	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		if (selected != null) {
			if(selected.makeWithdrawal(amt));
			{
				System.out.format(" $%.2f %2s %2s %2s %2s %n", amt," has been deducted from the ", selected.getAcctType(),
						" account of ",getName());


			return true;
			}
		}
		
		System.out.println("Incorrect amount, Try with correct amount, Bye."	);
		return false;
	}

	@SuppressWarnings("unused")
	private String getNamesOfAccounts() {
		
		MyStringList str = new MyStringList();
	
		for (Account al : accounts.getAccounts()) {
			if (al != null)
				str.add(al.toString());
			
		}
		return str.toString();
	}

}
