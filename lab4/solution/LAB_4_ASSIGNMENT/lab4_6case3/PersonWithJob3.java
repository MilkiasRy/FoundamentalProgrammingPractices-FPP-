package lab4_6case3;
import java.util.GregorianCalendar;

public class PersonWithJob3  {
	private Person3 p;
	private double salary;
	PersonWithJob3(String name, GregorianCalendar dob, double salary) {
		p=new Person3(name,dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return p.getName();
	}
	public boolean equals(Object ob) {
		int sum=1;
		if(ob == null) return false;
		//using compostion 
		if(!(ob.getClass()==this.getClass())) return false;
		PersonWithJob3 p = (PersonWithJob3)ob;
		if(!(this.getName().equals(p.getName())&&this.getDateOfBirth().equals(p.getDateOfBirth())&&
				Math.round(this.getSalary())-Math.round(p.getSalary())!=0))return false;
		return true;
			
				
				
	}
	public GregorianCalendar getDateOfBirth() {
		return p.getDateOfBirth();
	}
	
}
