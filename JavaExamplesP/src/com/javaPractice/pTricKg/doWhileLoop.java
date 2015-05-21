package com.javaPractice.pTricKg;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;


public class doWhileLoop {
	public static void main(String args[]) {
		// create file
		File books = new File("badBooks.txt");
		// scan for user input
		Scanner keyboard = new Scanner(System.in);
		char reply;
		
		do {
			out.print("Delete books? (y/n) ");
			reply = keyboard.findWithinHorizon(".", 0).charAt(0);
		}while (reply != 'y' && reply != 'Y' &&
				reply != 'n' && reply != 'N');
		
		if (reply == 'y' || reply == 'Y') {
			out.println("Deleting per your request...");
			books.delete();
			out.println("The books have been deleted.");
			
		}else {
			out.println("Need to confirm!");
		}
	}
}
