// Exercise 3.13: Test application for class Invoice.
package chapter3;

public class InvoiceTest
{
   public static void main( String[] args )
   {
      Invoice invoice1 = new Invoice( "83", "Electric sander", 7, 57.98 );
      Invoice invoice2 = new Invoice( "24", "Power saw", -3, -11.99 ); // invalid values

      System.out.println( "Invoice 1" );
      System.out.printf( "Part number:  %s\n", invoice1.getPartNumber() );
      System.out.printf( "Description:  %s\n", invoice1.getPartDescription() );
      System.out.printf( "Quantity:     %d\n", invoice1.getQuantity() );
      System.out.printf( "Price/item:   $%.2f\n", invoice1.getPricePerItem() );
      System.out.printf( "Amount:       $%.2f\n\n", invoice1.getInvoiceAmount() );

      System.out.println( "Invoice 2 (invalid quantity and price are set to 0)" );
      System.out.printf( "Quantity:     %d\n", invoice2.getQuantity() );
      System.out.printf( "Price/item:   $%.2f\n", invoice2.getPricePerItem() );
      System.out.printf( "Amount:       $%.2f\n\n", invoice2.getInvoiceAmount() );

      System.out.println( "Updating invoice 2 with valid values..." );
      invoice2.setQuantity( 4 );
      invoice2.setPricePerItem( 11.99 );
      System.out.printf( "Amount:       $%.2f\n", invoice2.getInvoiceAmount() );
   } // end main
} // end class InvoiceTest
