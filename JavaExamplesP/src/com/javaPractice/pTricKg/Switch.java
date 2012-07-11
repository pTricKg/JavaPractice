package com.javaPractice.pTricKg;

import java.util.Scanner;
import static java.lang.System.out;

public class Switch {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner (System.in);
		out.print("enter a number?");
		int something = keyboard.nextInt();
		
		switch (something) {
		case 1:
			out.println("The force is strong with this one.");
			break;
			
		case 2:
			out.println("When nine hundred years old you reach, look as good, you will not, hmmm?");
			break;
			
		case 3:
			out.println("To be Jedi is to face the truth, and choose. " +
					"Give off light, or darkness, Padawan. Be a candle, or the night.");
			break;
			
		case 4:
			out.println("Death is a natural part of life. Rejoice for those who transform into the Force. " +
					"Mourn them do not. Miss them do not. Attachment leads to jealousy. The shadow of greed, that is.");
			break;
			
		default:
			out.println("No! Try not. Do, or do not. There is no try.");
			break;
		}
		
		out.println("Hmm. In the end, cowards are those who follow the dark side.");
	}
}
