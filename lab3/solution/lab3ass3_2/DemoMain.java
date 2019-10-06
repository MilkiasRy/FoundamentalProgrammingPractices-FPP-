package lab3ass3_2;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
         Employee employee1=new Employee("Jim Daley",2000,9,4);
         Employee employee2=new Employee("Bob Reuben",1998,1,5);
         Employee employee3=new Employee("Susan Randolph",1997,2,13);
         System.out.println("See a report of all account balance? (y/n)" );
         Scanner sc=new Scanner(System.in);
         employee1.createNewChecking(10500);
         employee1.createNewSavings(1000);
         employee1.createNewRetirement(9300);
         employee2.createNewChecking(12600);
         employee2.createNewSavings(10038);
         employee2.createNewRetirement(9000);
         employee3.createNewRetirement(20000);

        if (sc.next().equals("y")){
        System.out.println(employee1.getFormattedAcctInfo());
        System.out.println(employee2.getFormattedAcctInfo());
        //System.out.println(employee3.getFormattedAcctInfo());

    }
        else
    {
        // do nothing...the application ends here

    }



}///////////////



}
