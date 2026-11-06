// GUI and Graphics Case Study Exercise 5.1: twelve concentric circles in the centre of a JPanel.
package chapter5;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ConcentricCirclesPanel extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int centerX = getWidth() / 2;
      int centerY = getHeight() / 2;

      // radius 10, 20, ... 120. The bounding rectangle's upper-left corner is one radius
      // up and one radius left of the centre; its width and height are the diameter.
      for ( int radius = 10; radius <= 120; radius += 10 )
         g.drawOval( centerX - radius, centerY - radius, 2 * radius, 2 * radius );
   } // end method paintComponent
} // end class ConcentricCirclesPanel

public class GuiExercise5_1
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame( "Exercise 5.1 - Concentric Circles" );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( new ConcentricCirclesPanel() );
      application.setSize( 300, 320 );
      application.setVisible( true );
   } // end main
} // end class GuiExercise5_1
