// GUI and Graphics Case Study Exercise 4.1 (a): lines fanning out from the top-left corner.
package chapter4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

// the panel that does the drawing (a second class in the same file)
class FanPanel extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int width = getWidth();
      int height = getHeight();
      int steps = 15; // divide the width and height into 15 equal steps

      int i = 0;
      while ( i <= steps )
      {
         // first endpoint is always the top-left corner (0, 0);
         // the second moves along the bottom-left -> top-right diagonal
         g.drawLine( 0, 0, i * width / steps, height - i * height / steps );
         ++i;
      }
   } // end method paintComponent
} // end class FanPanel

public class GuiExercise4_1a
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame( "Exercise 4.1(a)" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new FanPanel() );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise4_1a
