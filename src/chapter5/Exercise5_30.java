// Exercise 5.30 (Making a Difference): Global warming facts quiz.
// Five multiple-choice questions, four answers each (1-4). Final message depends on the score.
//
// NOTE: these questions are a starting draft based on widely documented facts. The book asks you to
// research BOTH sides of the issue yourself, so improve the questions and replace the website list
// at the bottom with the sources YOU actually used.
package chapter5;

import java.util.Scanner;

public class Exercise5_30
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      int correct = 0;

      System.out.println( "GLOBAL WARMING FACTS QUIZ\n" );

      System.out.println( "1. Which gas accounts for most human-caused greenhouse-gas emissions?" );
      System.out.println( "   1) Oxygen   2) Carbon dioxide   3) Argon   4) Neon" );
      System.out.print( "Your answer: " );
      if ( input.nextInt() == 2 )
         correct++;

      System.out.println( "\n2. The IPCC was set up in 1988 by the World Meteorological Organization and which UN programme?" );
      System.out.println( "   1) UNEP (Environment Programme)   2) UNICEF   3) UNESCO   4) WHO" );
      System.out.print( "Your answer: " );
      if ( input.nextInt() == 1 )
         correct++;

      System.out.println( "\n3. Which treaty, adopted in 1997, set binding emission targets for developed countries?" );
      System.out.println( "   1) Montreal Protocol   2) Geneva Convention   3) Kyoto Protocol   4) Helsinki Accords" );
      System.out.print( "Your answer: " );
      if ( input.nextInt() == 3 )
         correct++;

      System.out.println( "\n4. Which of these is a NATURAL factor that influences Earth's climate?" );
      System.out.println( "   1) Highway construction   2) Variations in the Sun's output   3) Plastic production   4) Air travel" );
      System.out.print( "Your answer: " );
      if ( input.nextInt() == 2 )
         correct++;

      System.out.println( "\n5. The 2015 Paris Agreement aims to hold warming well below how many degrees Celsius above pre-industrial levels?" );
      System.out.println( "   1) 0.5   2) 1   3) 2   4) 5" );
      System.out.print( "Your answer: " );
      if ( input.nextInt() == 3 )
         correct++;

      System.out.printf( "\nYou answered %d out of 5 correctly.\n", correct );

      switch ( correct )
      {
         case 5:
            System.out.println( "Excellent" );
            break;
         case 4:
            System.out.println( "Very good" );
            break;
         default: // three or fewer
            System.out.println( "Time to brush up on your knowledge of global warming." );
            System.out.println( "Some places to read more (replace with the sources you used):" );
            System.out.println( " - www.ipcc.ch" );
            System.out.println( " - climate.nasa.gov" );
            System.out.println( " - www.noaa.gov" );
            System.out.println( " - unfccc.int" );
            break;
      } // end switch
   } // end main
} // end class Exercise5_30
