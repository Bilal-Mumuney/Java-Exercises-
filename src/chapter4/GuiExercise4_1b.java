// GUI and Graphics Case Study Exercise 4.1 (b): lines fanning out from all four corners.
package chapter4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FourFanPanel extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int width = getWidth();
      int height = getHeight();
      int steps = 15;

      int i = 0;
      while ( i <= steps )
      {
         int x = i * width / steps;
         int y = i * height / steps;

         // top-left and bottom-right corners fan to the bottom-left -> top-right diagonal
         g.drawLine( 0, 0, x, height - y );
         g.drawLine( width, height, width - x, y );

         // top-right and bottom-left corners fan to the top-left -> bottom-right diagonal
         g.drawLine( width, 0, x, y );
         g.drawLine( 0, height, width - x, height - y );

         ++i;
      }
   } // end method paintComponent
} // end class FourFanPanel

public class GuiExercise4_1b
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame( "Exercise 4.1(b)" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new FourFanPanel() );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise4_1b
