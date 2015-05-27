import java.util.Random;
import java.util.Scanner;

public final class RandomNum {
  
  public static final void main(String... aArgs){
    log("Generating random numbers from 0 > your input.");

	Scanner userIn = new Scanner(System.in);

	String num;
	System.out.print("Enter a number: ");
	num = userIn.next();
	
	// Make int from input
	int num1 = Integer.parseInt(num);
    
    Random randomGenerator = new Random();
    for (int n = 1; n <= 10; ++n){
      int randomInt = randomGenerator.nextInt(num1);// use input
      log("Generated : " + randomInt);
    }
    
    log("Done.");
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
}
