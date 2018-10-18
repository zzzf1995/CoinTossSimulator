/**
 * class CoinSimViewer
 * To define the UI interface to display the outcome of coin simulation.
 */

import javax.swing.JFrame;
import java.util.Scanner;

public class CoinSimViewer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter number of trials: ");
      int number = in.nextInt();
      /**
       * Make sure that the trial number is greater than one.
       */
      if(number < 1){
         System.out.println("ERROR: Number entered must be greater than 0.");
      }else{
         
         JFrame frame = new JFrame();

         frame.setSize(800, 500);
         frame.setTitle("CoinSim");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         /**
            Create a CoinSimComponent. 
            @param g2  the number of coin trials
         */
         CoinSimComponent component = new CoinSimComponent(number);
         frame.add(component);

         frame.setVisible(true);
      }
      
   }
}
