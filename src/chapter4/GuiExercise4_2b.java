// GUI and Graphics Case Study Exercise 4.2 (b): the design of 4.2(a) mirrored in all four corners.
package chapter4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FourCornerArtPanel extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int width = getWidth();
      int height = getHeight();
      int steps = 15;

      int i = 0;
      while ( i < steps )
      {
         int x1 = 0;
         int y1 = i * height / steps;
         int x2 = ( i + 1 ) * width / steps;
         int y2 = height;

         g.drawLine( x1, y1, x2, y2 );                           // original (bottom-left curve)
         g.drawLine( width - x1, y1, width - x2, y2 );           // mirrored left <-> right
         g.drawLine( x1, height - y1, x2, height - y2 );         // mirrored top <-> bottom
         g.drawLine( width - x1, height - y1, width - x2, height - y2 ); // mirrored both ways

         ++i;
      }
   } // end method paintComponent
} // end class FourCornerArtPanel

public class GuiExercise4_2b
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame( "Exercise 4.2(b)" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new FourCornerArtPanel() );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise4_2b
