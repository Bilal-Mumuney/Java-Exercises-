// Exercise 3.13: Invoice class for a hardware store.
package chapter3;

public class Invoice
{
   private String partNumber;
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   public Invoice( String number, String description, int count, double price )
   {
      partNumber = number;
      partDescription = description;
      setQuantity( count );     // reuse the setters so the validation lives in one place
      setPricePerItem( price );
   }

   public void setPartNumber( String number )
   {
      partNumber = number;
   }

   public String getPartNumber()
   {
      return partNumber;
   }

   public void setPartDescription( String description )
   {
      partDescription = description;
   }

   public String getPartDescription()
   {
      return partDescription;
   }

   // if the quantity is not positive it is set to 0
   public void setQuantity( int count )
   {
      if ( count > 0 )
         quantity = count;
      else
         quantity = 0;
   }

   public int getQuantity()
   {
      return quantity;
   }

   // if the price is not positive it is set to 0.0
   public void setPricePerItem( double price )
   {
      if ( price > 0.0 )
         pricePerItem = price;
      else
         pricePerItem = 0.0;
   }

   public double getPricePerItem()
   {
      return pricePerItem;
   }

   // invoice amount = quantity * price per item
   public double getInvoiceAmount()
   {
      return quantity * pricePerItem;
   }
} // end class Invoice
