 package lab4_6case1;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
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
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		if( p.name.equals(this.name) && p.dateOfBirth.equals(this.dateOfBirth))return true;
		return false;
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Person person1 = new Person("TOM", new GregorianCalendar(1955, 3, 4));
		Person person2 = new Person("JERRY", new GregorianCalendar(1967, 6, 4));
		Person person3 = new Person("TOM", new GregorianCalendar(1955, 3, 4));

		Person personw1 = new PersonWithJob("JERRY", new GregorianCalendar(1987, 3, 4), 67000.00);
		Person personw2 = new PersonWithJob("TOM", new GregorianCalendar(1955, 3, 4), 67000.00);
		Person personw3 = new PersonWithJob("JERRY", new GregorianCalendar(1987, 2, 4), 89000.00);
		

		System.out.println("******* SOLUTION FOR Case One**************");
		
		System.out.println("--------------------------------------------");

		System.out.println(" IS Person1 is equal to person2, ans: " + person1.equals(person3));
		System.out.println(" IS Person1 is equal to person2, ans: "  + person1.equals(person2));

		System.out.println(" IS Person1 is equal to personw2,ans: "  + person1.equals(personw2));

		System.out.println(" IS Personw1 is equal to personw2,ans:" + personw1.equals(personw2));
		
		

	}

}
