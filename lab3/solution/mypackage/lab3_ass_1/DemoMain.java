package mypackage.lab3_ass_1;

public class DemoMain {

	public static void main(String[] args) {
		
			Employee employee1=new Employee("Efrem","black panther",100000,2016,11,10);
			Account checking=new Account(employee1,AccountType.CHECKING,300);
			Account savings=new Account (employee1,AccountType.SAVINGS,300);
			Account retirement=new Account(employee1,AccountType.RETIREMENT,300);
			System.out.println("Checking Account: "+checking.toString()+"\n"
					+"Savings Account: "+savings.toString()+"\n"
					+"Retirement Account: "+retirement.toString());

			
		// TODO Auto-generated method stub

	}

}
