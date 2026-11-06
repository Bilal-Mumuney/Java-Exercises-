// Exercise 3.14: Test application for class Employee.
package chapter3;

public class EmployeeTest
{
   public static void main( String[] args )
   {
      Employee employee1 = new Employee( "Chinedu", "Eze", 3500.00 );
      Employee employee2 = new Employee( "Fatima", "Musa", 4200.50 );

      System.out.println( "Yearly salaries:" );
      System.out.printf( "%s %s: $%.2f\n", employee1.getFirstName(), employee1.getLastName(),
         employee1.getMonthlySalary() * 12 );
      System.out.printf( "%s %s: $%.2f\n\n", employee2.getFirstName(), employee2.getLastName(),
         employee2.getMonthlySalary() * 12 );

      // give each employee a 10% raise
      employee1.setMonthlySalary( employee1.getMonthlySalary() * 1.10 );
      employee2.setMonthlySalary( employee2.getMonthlySalary() * 1.10 );

      System.out.println( "Yearly salaries after a 10% raise:" );
      System.out.printf( "%s %s: $%.2f\n", employee1.getFirstName(), employee1.getLastName(),
         employee1.getMonthlySalary() * 12 );
      System.out.printf( "%s %s: $%.2f\n", employee2.getFirstName(), employee2.getLastName(),
         employee2.getMonthlySalary() * 12 );

      // a negative salary is rejected
      employee1.setMonthlySalary( -100 );
      System.out.printf( "\nAfter trying to set -100, employee1 monthly salary is still $%.2f\n",
         employee1.getMonthlySalary() );
   } // end main
} // end class EmployeeTest
