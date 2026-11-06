// GUI and Graphics Case Study Exercise 4.2 (a): line art - one corner.
package chapter4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LineArtPanel extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int width = getWidth();
      int height = getHeight();
      int steps = 15; // each edge is divided into 15 equal increments

      int i = 0;
      while ( i < steps )
      {
         // starts at the top-left corner, ending one step right on the bottom edge;
         // each next line moves down one step on the left edge and right one step on the bottom edge
         g.drawLine( 0, i * height / steps, ( i + 1 ) * width / steps, height );
         ++i;
      }
   } // end method paintComponent
} // end class LineArtPanel

public class GuiExercise4_2a
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame( "Exercise 4.2(a)" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new LineArtPanel() );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise4_2a
