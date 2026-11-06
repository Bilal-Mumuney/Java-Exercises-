// Exercise 5.17: Calculating sales - sentinel-controlled loop and a switch for the prices.
// Product 1 = $2.98, 2 = $4.50, 3 = $9.98, 4 = $4.49, 5 = $6.87
package chapter5;

import java.util.Scanner;

public class Exercise5_17
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double totalRetailValue = 0.0;

      System.out.print( "Enter product number (1-5, or -1 to finish): " );
      int product = input.nextInt();

      while ( product != -1 ) // sentinel value
      {
         System.out.print( "Enter quantity sold: " );
         int quantity = input.nextInt();

         double price = 0.0;
         boolean valid = true;

         switch ( product )
         {
            case 1:
               price = 2.98;
               break;
            case 2:
               price = 4.50;
               break;
            case 3:
               price = 9.98;
               break;
            case 4:
               price = 4.49;
               break;
            case 5:
               price = 6.87;
               break;
            default:
               System.out.println( "Invalid product number - ignored." );
               valid = false;
               break;
         } // end switch

         if ( valid )
            totalRetailValue += price * quantity;

         System.out.print( "\nEnter product number (1-5, or -1 to finish): " );
         product = input.nextInt();
      } // end while

      System.out.printf( "Total retail value of all products sold: $%,.2f\n", totalRetailValue );
   } // end main
} // end class Exercise5_17
