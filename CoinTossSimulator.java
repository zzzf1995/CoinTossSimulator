/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
//import the statement to react random number.
import java.util.Random;

public class CoinTossSimulator {
   
   private int NumTrials;
   private int TwoHeads;
   private int TwoTails;
   private int HeadTails;
   private Random Coinone;
   private Random Cointwo;

   /**
      Creates a coin toss simulator with no trials done yet.
      This is a constructor.
   */
   public CoinTossSimulator() {
      
      Coinone = new Random();
      Cointwo = new Random();      
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
      NumTrials = NumTrials + numTrials;
      for(int i = 0; i < numTrials; i++){
         int one = Coinone.nextInt(2);
         int two = Cointwo.nextInt(2);
         if(one == 1 && two == 1){
            TwoHeads++;
         }else if(one == 0 && two ==0){
            TwoTails++;
         }else{
            HeadTails++;
         }     
      }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return NumTrials; 
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return TwoHeads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return TwoTails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return HeadTails; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      
      NumTrials = 0;
      TwoTails = 0;
      TwoHeads = 0;
      HeadTails = 0;

   }

}
