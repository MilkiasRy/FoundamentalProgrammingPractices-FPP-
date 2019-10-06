package lab4_1;



import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Professor p1 = new Professor("Dr Number_One", LocalDate.of(2016, 7, 14), 9000);
		Professor p2 = new Professor("Dr Number_two", LocalDate.of(2016, 7, 14), 11000);
		Professor p3 = new Professor("Dr Number_three", LocalDate.of(2016,7, 14), 60000);

		Secretary s1 = new Secretary("SecNumber_one", LocalDate.of(2016, 7, 14), 3000);
		Secretary s2 = new Secretary("SecNumber_two", LocalDate.of(2016, 7, 14), 2000);

		p1.setNumberOfPublications(10);
		p2.setNumberOfPublications(10);
		p3.setNumberOfPublications(10);

		s1.setOvertimeHours(200);
		s2.setOvertimeHours(200);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = p1;
		department[1] = p2;
		department[2] =p3;
		department[3] = s1;
		department[4] =s2;
		System.out.println("Would do you like to see the  sum of all salaries .......y/n");
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		double sum = 0;
		if (answer.equals("y") || answer.equals("Y")) {

			for (DeptEmployee dpt : department) {
				System.out.printf("%10s %-15s gets %7.2f\n",dpt.getClass().getSimpleName() ,dpt.getName(),  dpt.computeSalary());
				sum += dpt.computeSalary();
			}

			System.out.printf("\nTotal sum of all department salaries is $%.2f ", sum);

		} else {
			System.out.println("Thank you! Good bye!!");
		}
		scan.close();
	}

}

