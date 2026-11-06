// GUI Case Study Exercise 3.1 (Section 3.8): addition program using dialog boxes.
package chapter3;

import javax.swing.JOptionPane;

public class GuiExercise3_1
{
   public static void main( String[] args )
   {
      // showInputDialog returns a String, so convert each one with Integer.parseInt
      String firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
      String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

      int number1 = Integer.parseInt( firstNumber );
      int number2 = Integer.parseInt( secondNumber );
      int sum = number1 + number2;

      // String.format works like printf but RETURNS the formatted String
      String message = String.format( "The sum of %d and %d is %d", number1, number2, sum );
      JOptionPane.showMessageDialog( null, message );
   } // end main
} // end class GuiExercise3_1
