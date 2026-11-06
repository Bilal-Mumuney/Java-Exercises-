// GUI and Graphics Case Study Exercise 5.2: Exercise 5.16 (bar chart) using dialogs for input
// and rectangles for the bars.
package chapter5;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class BarChartPanel extends JPanel
{
   private int number1, number2, number3, number4, number5;

   public BarChartPanel( int n1, int n2, int n3, int n4, int n5 )
   {
      number1 = n1;
      number2 = n2;
      number3 = n3;
      number4 = n4;
      number5 = n5;
   }

   // draws one horizontal bar: a filled rectangle 10 pixels long per unit of value
   private void drawBar( Graphics g, int row, int value )
   {
      int barHeight = 20;
      int y = 20 + row * ( barHeight + 10 );

      g.fillRect( 20, y, value * 10, barHeight );
      g.drawString( "" + value, 28 + value * 10, y + 15 ); // label at the end of the bar
   }

   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      drawBar( g, 0, number1 );
      drawBar( g, 1, number2 );
      drawBar( g, 2, number3 );
      drawBar( g, 3, number4 );
      drawBar( g, 4, number5 );
   } // end method paintComponent
} // end class BarChartPanel

public class GuiExercise5_2
{
   public static void main( String[] args )
   {
      int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

      for ( int i = 1; i <= 5; i++ )
      {
         int number;

         do // keep asking until the value is between 1 and 30
         {
            String text = JOptionPane.showInputDialog( "Enter number " + i + " (1-30)" );

            if ( text == null ) // user pressed Cancel
               return;

            number = Integer.parseInt( text.trim() );
         } while ( number < 1 || number > 30 );

         switch ( i )
         {
            case 1: n1 = number; break;
            case 2: n2 = number; break;
            case 3: n3 = number; break;
            case 4: n4 = number; break;
            case 5: n5 = number; break;
         }
      } // end for

      JFrame application = new JFrame( "Exercise 5.2 - Bar Chart" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new BarChartPanel( n1, n2, n3, n4, n5 ) );
      application.setSize( 420, 260 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise5_2
