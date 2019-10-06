package lab4_6case2;
import java.util.GregorianCalendar;

public class PersonWithJob extends Person2{
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(this.getClass()==ob.getClass())) 
			return false;
		PersonWithJob p = (PersonWithJob)ob;
		if(! (this.getName().equals(p.getName()))&& (this.getDateOfBirth().equals(p.getDateOfBirth())&&
			(this.salary==p.salary))) return false;
		return true;
	}
}
