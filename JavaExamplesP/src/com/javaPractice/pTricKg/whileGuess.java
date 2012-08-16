package com.javaPractice.pTricKg;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class whileGuess {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int numberGuess = 0;
		int randomNumber = new Random().nextInt(10) + 1;
		
		out.println("  #########  ");
		out.println("Your Best Guess!!");
		out.println("  #########  ");
		out.println();
		
		out.print("Enter an integer from 1 to 10: ");
		int inputNumber = keyboard.nextInt();
		numberGuess++;
		
		while (inputNumber != randomNumber) {
			out.println();
			out.println("Give it another shot....");
			out.print("Enter an integer from 1 to 10: ");
			inputNumber = keyboard.nextInt();
			numberGuess++;
}
	out.print("You guessed correctly after ");
	out.println(numberGuess + " guesses.");
}
}