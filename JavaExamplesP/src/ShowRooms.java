import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class ShowRooms {
	
	public static void main(String args[]) throws IOException {
	
	Room rooms[] = new Room[10];  //array
	//or arraylist
	//ArrayList<String> rooms = new ArrayList<String>();
		
	Scanner dskScanner = new Scanner(new File("RoomList.txt"));
	
	//using ArrayList
	/*while (dskScanner.hasNext()) {
		rooms.add(dskScanner.nextLine());
	}
	rooms.remove(0); takes out a room from array
	rooms.add(3, "something"); puts "something" in place 3 of array list*/
	
	//use enhanced for loop to display changes to txt file
	/*for (String RoomsList : rooms) {
		out.println(RoomsList);*/
	
	for (int roomNum = 0; roomNum < 10; roomNum++ ) { //reads guests value
		rooms[roomNum] = new Room();
		rooms[roomNum].readRoom(dskScanner);
	}
	
	out.println("Room\tGuests\tRate\tSmoking?");
	for (int roomNum = 0; roomNum < 10; roomNum++ ) { //reads guests value
		out.print(roomNum);
		out.print("\t");
		rooms[roomNum].writeRoom();
	}
}
}
