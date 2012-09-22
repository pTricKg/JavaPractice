import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



class HotelMotel {
	
	public static void main(String args[]) throws IOException {
		
		int guests[] = new int[10]; //int declaration reserves guests variable, new int assigns mem for new array
			
		Scanner scan = new Scanner(new File("GuestList.txt"));
				
		for (int roomNum = 0; roomNum < 10; roomNum++ ) { //reads guests value
			guests[roomNum] = scan.nextInt();
		}
		
		
		out.println("Room\tGuests");
		
		for (int roomNum = 0; roomNum < 10; roomNum++ ) { //writes guests value
			out.print(roomNum);
			out.print("\t");
			out.println(guests[roomNum]);
		}
		

	}
	
	
}
