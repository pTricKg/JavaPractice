import static java.lang.System.out;

import java.text.NumberFormat;
import java.util.Scanner;

public class Room {
	
	private int guests;
	private double rate; //int, long, BigDecimal is better than using double, float types
	private boolean smoking;
	private static NumberFormat currency = NumberFormat.getCurrencyInstance(); 
	
	/*DecimalFormat is subclass of NumberFormat, 
	NumberFormat is easier to use due to less specificity
	getCurrencyInstance is 'factory method' to display dollar amounts*/
	
	public void readRoom(Scanner dskScanner) {
		guests = dskScanner.nextInt();
		rate = dskScanner.nextDouble();
		smoking = dskScanner.nextBoolean();
		}
	public void writeRoom() {
		out.print(guests);
		out.print("\t");
		out.print(currency.format(rate));
		out.print("\t");
		out.println(smoking ? "yes" : "no"); //conditional operator, like mini if statement
	}				//test condition ? expression1 : expression2

}
