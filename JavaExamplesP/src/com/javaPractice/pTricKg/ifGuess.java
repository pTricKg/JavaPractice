package com.javaPractice.pTricKg;
import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;


public class ifGuess {
	public static void main(String args[]) {
		Scanner pickNumber = new Scanner (System.in);
		
		out.print("Enter a whole number from 1 to 10: ");
		
		int numberGuess = 0;
		int inputNumber = pickNumber.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		while (inputNumber != randomNumber) {
			out.println();
			out.println("Sorry! That's not it.");
			out.println(inputNumber + " is not what I'm looking for.");
			out.println("Give it another try...");
			inputNumber = pickNumber.nextInt();
			numberGuess++;
			
			if (inputNumber == randomNumber) {
				out.println("Hurray!");
				out.println("You Win!");
				out.println("The force is strong with this one.");
			}
//				else {
//				out.println("Sorry! That's not it.");
//				out.println(inputNumber + "is not what I'm looking for.");
//				out.println("is not what I'm looking for.");
				
//			}
			
		}
		
		
		out.println("You win after " + numberGuess + " guesses.");
		
	}
}
