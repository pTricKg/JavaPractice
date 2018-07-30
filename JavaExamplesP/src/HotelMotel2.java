import static java.lang.System.out;


public class HotelMotel2 {
	//using enhanced for loop
	public static void main(String args[]) {
		int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
		int roomNum = 0;
		
		out.println("Room\tGuests");
		
		for (int numGuests : guests) { // for v-type v-name : value range
			out.print(roomNum++);
			out.print("\t");
			out.println(numGuests);
			//new statements will not affect values in array using this enhanced for loop
		}
		}
	}


