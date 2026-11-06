// Exercise 3.12: Test application for Account's debit method.
package chapter3;

public class
AccountTest
{
   public static void main( String[] args )
   {
      Account account1 = new Account( 50.00 );
      Account account2 = new Account( -7.53 ); // invalid -> balance stays 0.00

      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

      System.out.println( "Debiting 25.00 from account1..." );
      account1.debit( 25.00 );
      System.out.printf( "account1 balance: $%.2f\n\n", account1.getBalance() ); // 25.00

      System.out.println( "Debiting 100.00 from account1 (too much)..." );
      account1.debit( 100.00 ); // prints the error message
      System.out.printf( "account1 balance: $%.2f (unchanged)\n\n", account1.getBalance() );

      System.out.println( "Debiting 25.00 from account1 (exactly the balance)..." );
      account1.debit( 25.00 );
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() ); // 0.00
   } // end main
} // end class AccountTest
