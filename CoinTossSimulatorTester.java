/**
 *A program to test the output of CoinTossSimulator
 */

public class CoinTossSimulatorTester{
    public static void main(String[] args){
	CoinTossSimulator test = new CoinTossSimulator();
	System.out.println("After constructor:");
	System.out.println("Number of Trails [exp:0]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses: " + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));

	test.run(1);
	System.out.println("After run(1):");
	System.out.println("Number of Trails [exp:1]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses:" + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));

	test.run(10);
	System.out.println("After run(10):");
	System.out.println("Number of Trails [exp:11]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses: " + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));

	test.run(100);
	System.out.println("After run(100):");
	System.out.println("Number of Trails [exp:111]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses: " + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));

	test.reset();
	System.out.println("After reset:");
	System.out.println("Number of Trails [exp:0]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses: " + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));

	test.run(1000);
	System.out.println("After run(1000):");
	System.out.println("Number of Trails [exp:1000]: " + test.getNumTrials());
	System.out.println("Two-Head tosses: " + test.getTwoHeads());
    System.out.println("Two-Tail tosses: " + test.getTwoTails());
	System.out.println("One-Head one-tail tosses: " + test.getHeadTails());
	System.out.println("Tosses add up correcttly? " + (test.getNumTrials() == test.getTwoHeads() + test.getTwoTails() + test.getHeadTails()));
	
    }
}
