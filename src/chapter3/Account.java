// Exercise 3.12: Account class with a debit method.
package chapter3;

public class Account
{
   private double balance; // instance variable that stores the balance

   // constructor: only accepts a positive initial balance
   public Account( double initialBalance )
   {
      if ( initialBalance > 0.0 )
         balance = initialBalance;
   }

   public void credit( double amount )
   {
      balance = balance + amount;
   }

   // withdraw money, but never let the balance go below what is available
   public void debit( double amount )
   {
      if ( amount > balance )
         System.out.println( "Debit amount exceeded account balance." );
      else
         balance = balance - amount;
   }

   public double getBalance()
   {
      return balance;
   }
} // end class Account
