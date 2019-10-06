package lab4_6case2;

import java.util.GregorianCalendar;

import lab4_6case1.Person;
import lab4_6case1.PersonWithJob;

public class Person2 {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person2(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(this.getClass()==ob.getClass())) return false;
		Person2 p = (Person2)ob;
	if( p.name.equals(this.name) || p.dateOfBirth.equals(this.dateOfBirth)) return false;
	return true;
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person1 = new Person2("TOM", new GregorianCalendar(1955, 3, 4));
		Person2 person2 = new Person2("JERRY", new GregorianCalendar(1967, 6, 4));
		Person2 person3 = new Person2("TOM", new GregorianCalendar(1955, 3, 4));

		PersonWithJob personw1 = new PersonWithJob("TOM", new GregorianCalendar(1955, 3, 4), 67000.00);
		PersonWithJob personw2 = new PersonWithJob("TOM", new GregorianCalendar(1955, 3, 4), 67000.00);
		PersonWithJob personw3 = new PersonWithJob("JERRY", new GregorianCalendar(1987, 2, 4), 89000.00);
		

		System.out.println("******* SOLUTION FOR Case Two**************");
		
		System.out.println("--------------------------------------------");

		System.out.println(" IS Person1 is equal to person2, ans: " + person1.equals(person3));
		System.out.println(" IS Person1 is equal to person2, ans: "  + person1.equals(person2));

		System.out.println(" IS Person1 is equal to personw2,ans: "  + person1.equals(personw2));

		System.out.println(" IS Personw1 is equal to personw2,ans:" + personw1.equals(personw2));
		

	}

}
