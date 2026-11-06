// Exercise 4.18: Credit limit calculator - sentinel-controlled repetition (-1 ends the program).
package chapter4;

import java.util.Scanner;

public class Exercise4_18
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter account number (or -1 to quit): " );
      int account = input.nextInt();

      while ( account != -1 )
      {
         System.out.print( "Enter beginning balance: " );
         int beginningBalance = input.nextInt();

         System.out.print( "Enter total charges: " );
         int charges = input.nextInt();

         System.out.print( "Enter total credits: " );
         int credits = input.nextInt();

         System.out.print( "Enter credit limit: " );
         int creditLimit = input.nextInt();

         int newBalance = beginningBalance + charges - credits;
         System.out.printf( "New balance is %d\n", newBalance );

         if ( newBalance > creditLimit )
            System.out.printf( "Account: %d\nCredit limit: %d\nBalance: %d\nCredit limit exceeded\n",
               account, creditLimit, newBalance );

         System.out.print( "\nEnter account number (or -1 to quit): " );
         account = input.nextInt();
      } // end while
   } // end main
} // end class Exercise4_18
