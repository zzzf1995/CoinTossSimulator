
//import the statements to draw the bar outlook 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Font;
import java.awt.geom.Rectangle2D;
import java.awt.font.FontRenderContext;

/**
 * class CoinSimComponent
 * This component gives concrete criterion about how to draw the bar.
 * Constructor initializes any necessary data and runs the simulation.
 * This component draws three bar shapes.
*/
public class CoinSimComponent extends JComponent
{  

   private int Trials;
   private CoinTossSimulator test;
   
   /**
    * Define a constructor for this class.
    * So we can receive the number of trials that a user enters in.
   */
   public CoinSimComponent(int number){
      Trials = number;
      test = new CoinTossSimulator();
      test.run(Trials);
   }
   
   
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      /**
       * Accept the simulated date from CoinTossSimulator.
      */
      int twoHeads = test.getTwoHeads();
      int twoTails = test.getTwoTails(); 
      int headTails = test.getHeadTails();
      int percentOfTwoheads = (int)Math.round(twoHeads*100.0/Trials);
      int percentOfTwotails = (int)Math.round(twoTails*100.0/Trials);
      int percentOfHeadtails = (int)Math.round(headTails*100.0/Trials);
      
      /**
       * Get the height of a label.
      */
      String label = "Hello, world!";   // just list a testing string in order to get the height of the string in default font.
      Font font = g2.getFont();
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D labelBounds = font.getStringBounds(label, context);
      int heightOfLabel = (int)labelBounds.getHeight();
      
      /**
       * The meaning of bw, vb, w, scale are the same meaning as they are shown in the assignment instrucion.
      */
      int bw = 50;
      int vb = 35;
      int w = (getWidth() - 3 * bw)/4;
      int tb = getHeight() - 2 * vb - heightOfLabel; //the talled height of a bar if this bar presents 100%.
      int bottom = getHeight() - vb;
      double scale = tb * 1.0/Trials;
      
      
      /**
       * Define the content of each label under each bar.
      */
      String bar1_label = "Two Heads: " + twoHeads + " (" + percentOfTwoheads + "%)";
      String bar2_label = "A Head and a Tail: " + headTails + " (" + percentOfHeadtails + "%)";
      String bar3_label = "Two Tails: " + twoTails + " (" + percentOfTwotails + "%)";
      

      Bar bar1 = new Bar(bottom, w, bw, twoHeads, scale, Color.RED, bar1_label);
      Bar bar2 = new Bar(bottom, 2*w+bw , bw, headTails, scale, Color.GREEN, bar2_label);
      Bar bar3 = new Bar(bottom, 3*w+2*bw , bw, twoTails, scale, Color.BLUE, bar3_label);
      
      bar1.draw(g2);
      bar2.draw(g2);
      bar3.draw(g2);
   }
}
