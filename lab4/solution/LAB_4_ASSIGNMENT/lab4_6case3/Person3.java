package lab4_6case3;
import java.util.GregorianCalendar;

import lab4_6case1.PersonWithJob;
import lab4_6case2.Person2;

public class Person3 {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person3(String name, GregorianCalendar dob) {
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
		//using compostion 
		if(!(ob.getClass()==this.getClass())) return false;
		Person3 p = (Person3)ob;
		if(p.name.equals(this.name) && p.dateOfBirth.equals(this.dateOfBirth))return true;
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
		Person3 person1 = new Person3("TOM", new GregorianCalendar(1955, 3,   4));
		Person3  person2 = new Person3("JERRY", new GregorianCalendar(1967, 6, 4));
		Person3 person3 = new Person3("TOM", new    GregorianCalendar(   1955,   3,    4));

		PersonWithJob3 personw1 = new PersonWithJob3("TOM", new GregorianCalendar(1955, 3, 4), 67000.00);
		PersonWithJob3 personw2 = new PersonWithJob3("TOM", new GregorianCalendar(1955, 3, 4), 67000.00);
		PersonWithJob3 personw3 = new PersonWithJob3("JERRY", new GregorianCalendar(1987, 2, 4), 89000.00);
		

		System.out.println("******* SOLUTION FOR Case Three ***********");
		
		System.out.println("--------------------------------------------");

		System.out.println(" IS Person1 is equal to person2, ans: " + person1.equals(person3));
		System.out.println(" IS Person1 is equal to person2, ans: "  + person1.equals(person2));

		System.out.println(" IS Person1 is equal to personw2,ans: "  + person1.equals(personw2));

		System.out.println(" IS Personw1 is equal to personw2,ans:" + personw1.equals(personw2));
		


	}

}
