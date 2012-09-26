import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.out;

class Inventory {
	
	public static void main(String args[]) {
		final double boxPrice = 3.25;
		Scanner keybd = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		out.print("How many boxes do we have? ");
		String numBoxesIn = keybd.next();
		
		//try-catch clause to find parsing errors and continue to run when user input bad value
		try {
			int numBoxes = Integer.parseInt(numBoxesIn);
			out.print("The value is ");
			out.println(currency.format(numBoxes * boxPrice));
			
			//making own exception
			if (numBoxes < 0) {
				throw new OutOfRangeException();//refers to class
			}
			//making another to check to large of number of input
			if (numBoxes > 1000) {
				throw new NumberTooLargeException();//refers to class
			}
		//if caught, will run catch code, looks for NumberFormatException and stores values in e params	
		}catch (NumberFormatException e) {
			out.println("That's not correct number.");
			//to get detail message about error
			//out.println("Message: ***" + "***");  ///output isn't ordered so stack trace may be first or...
			System.err.println("Message: ***"); 
			e.printStackTrace();
			
		//another catch referring to OutOfRange.. class to check negative number input
		}catch (OutOfRangeException e) {
			out.print(numBoxesIn);
			out.println("?. Huh?? Can't have negative amount of boxes in inventory!!");
			
		//another catch for too large of number
		}catch (NumberTooLargeException e) {
			out.print("This isn't right, ");
			out.println("but I'm unclear what the problem is.  Try your input again.");
		}
		out.println("Incredible!");
	}	

}
