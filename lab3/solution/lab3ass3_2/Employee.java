package lab3ass3_2;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringJoiner;

public class Employee {
    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;
    private String name;
    private LocalDate hireDate;
    public Employee(String name, int yearOfHire,
                    int monthOfHire, int dayOfHire){
        this.name = name;
//Replace these lines with LocalDate references
//GregorianCalendar cal =
//new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
//hireDate = cal.getTime();
        hireDate=LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
    }
    public void createNewChecking(double startAmount) {

        checkingAcct=new Account(this,AccountType.CHECKING,startAmount);

    }
    public void createNewSavings(double startAmount) {
        //Employee employee1=new Employee("Efrem",1997,9,12);
        savingsAcct=new Account(this,AccountType.SAVINGS,startAmount);
    }
    public void createNewRetirement(double startAmount) {

        retirementAcct=new Account(this,AccountType.RETIREMENT,startAmount);
    }
    public void deposit(AccountType acctType, double amt){
        if (acctType.equals(AccountType.CHECKING)){
            checkingAcct.makeDeposit(amt);}
        else if (acctType.equals(AccountType.SAVINGS)){
            savingsAcct.makeDeposit(amt);}
        else {
            retirementAcct.makeDeposit(amt);}

    }
    public boolean withdraw(AccountType acctType, double amt){
        if (acctType.equals(AccountType.CHECKING)){
            return checkingAcct.makeWithdrawal(amt);}
        else if (acctType.equals(AccountType.SAVINGS)){
            return savingsAcct.makeWithdrawal(amt);}
        else {
            return retirementAcct.makeWithdrawal(amt);}
    }
    public String getFormattedAcctInfo() {
        String result = null;
        StringJoiner sjr=new StringJoiner("","","/n");
        if (checkingAcct!=null){
            result= "Account Info for MR :"+name+"\n"+"AccountType:"
                    + AccountType.CHECKING+"\n" +"current balance: "+checkingAcct.getBalance()+"\n"+"hire of date :"+hireDate+"\n";
        }
        if (savingsAcct!=null){
            result+="AccountType:"+ AccountType.SAVINGS+"\n" +"current balance: "+savingsAcct.getBalance()+"\n";
        }
        if (retirementAcct!=null){
            result+="AccountType:"+ AccountType.RETIREMENT+"\n" +"current balance "+retirementAcct.getBalance()+"\n";
        }
        return result;

    }
    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }



}