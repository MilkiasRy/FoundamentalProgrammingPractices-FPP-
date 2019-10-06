package mypackage.lab3_ass_1;

public final class Account {

public final static String CHECKING = "checking";

public final static String SAVINGS = "savings";

public final static String RETIREMENT = "retirement";

private final static double DEFAULT_BALANCE = 0.0;

private double balance;

private AccountType  acctType;

private Employee employee;

public Account(Employee emp, AccountType acctType, double balance){

employee = emp;

this.acctType= acctType;

this.balance = balance;

}

Account(Employee emp, AccountType acctType){

this(emp,acctType,DEFAULT_BALANCE);

}

public String toString() {

return "type = " + acctType + ", balance = " + balance;

}

public void makeDeposit(double deposit) {

//implement
	balance=balance+deposit;

}

public boolean makeWithdrawal(double amount) {
	if(balance>amount)return true;
	else return false;
	
	

//implement

}

public void setBalance(double balance) {
	this.balance = balance;
}

public void setAcctType(AccountType acctType) {
	this.acctType = acctType;
}

}