import java.util.Random;
import java.util.Scanner;

public final class RandomNum {
  /**
	Generate Random Number from User Input
	for max number and sample frequency.
*/
  public static final void main(String... aArgs){
    log("Generating random numbers from 0 to your input.");

	Scanner userIn = new Scanner(System.in);

	String num;
	System.out.print("Enter max number: ");
	num = userIn.next();

	String tm;
	System.out.print("How many random numbers to generate?: ");
	tm = userIn.next();
	
	// Make int from input
	int num1 = Integer.parseInt(num);
	int tim1 = Integer.parseInt(tm);
    
    Random randomGenerator = new Random();
    for (int n = 1; n <= tim1; ++n){
      int randomInt = randomGenerator.nextInt(num1);// use input
      log("Generated : " + randomInt);
    }
    
    log("Done.");
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
}
