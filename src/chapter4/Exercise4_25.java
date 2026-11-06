// Exercise 4.25: What does the following program print?
package chapter4;

public class Exercise4_25
{
   public static void main( String[] args )
   {
      int count = 1;

      // odd count -> "****", even count -> "++++++++"; so 10 lines that ALTERNATE,
      // starting with ****  (5 lines of **** and 5 lines of ++++++++)
      while ( count <= 10 )
      {
         System.out.println( count % 2 == 1 ? "****" : "++++++++" );
         ++count;
      } // end while
   } // end main
} // end class Exercise4_25
