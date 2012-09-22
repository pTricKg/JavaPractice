import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.PrintStream;



public class HotelMotelOpen {
	public static void main(String args[]) throws IOException {
			
			int guests[] = new int[10]; //int declaration reserves guests variable, new int assigns mem for new array
			int roomNum;
			
			Scanner scan = new Scanner(new File("GuestList.txt"));
			Scanner kb = new Scanner(System.in);
			
			for (roomNum = 0; roomNum < 10; roomNum++ ) { //reads guests value
				guests[roomNum] = scan.nextInt();
			}
			
			roomNum = 0;
			while (roomNum < 10 && guests[roomNum] != 0) {
				roomNum++; //check if room is empty, if not increment
			}
			if (roomNum == 10) {
				out.println("Sorry, no vacancy");
			}else {
				out.print("How many people for room ");
				out.print(roomNum);
				out.print("? ");
				guests[roomNum] = kb.nextInt();
				
				PrintStream listOut = new PrintStream("GuestList.txt"); //modifies GuestList.txt
				
				for (roomNum = 0; roomNum < 10; roomNum++) {
					listOut.print(guests[roomNum]);
					listOut.print(" ");
				}
			}
}
}
