package com.javaPractice.pTricKg;
import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;


public class ifGuess {
	public static void main(String args[]) {
		Scanner pickNumber = new Scanner (System.in);
		
		out.print("Enter a whole number from 1 to 10: ");
		
		
		int inputNumber = pickNumber.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		if (inputNumber == randomNumber) {
			out.println("Hurray!");
			out.println("You Win!");
			out.println("Hurray!");
		}else {
				out.println("Sorry! You lose.");
				out.println("The correct number was ");
				out.println(randomNumber + ".");
						
		}
		out.println("Thanks for playing!");
	}
}
