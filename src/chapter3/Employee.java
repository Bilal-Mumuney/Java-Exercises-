// Exercise 3.14: Employee class.
package chapter3;

public class Employee
{
   private String firstName;
   private String lastName;
   private double monthlySalary;

   public Employee( String first, String last, double salary )
   {
      firstName = first;
      lastName = last;
      setMonthlySalary( salary );
   }

   public void setFirstName( String first )
   {
      firstName = first;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setLastName( String last )
   {
      lastName = last;
   }

   public String getLastName()
   {
      return lastName;
   }

   // a salary that is not positive is NOT stored (the field keeps its old value, 0.0 by default)
   public void setMonthlySalary( double salary )
   {
      if ( salary > 0.0 )
         monthlySalary = salary;
   }

   public double getMonthlySalary()
   {
      return monthlySalary;
   }
} // end class Employee
