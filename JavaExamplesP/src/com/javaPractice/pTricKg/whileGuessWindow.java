package com.javaPractice.pTricKg;
import java.util.Random;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class whileGuessWindow {
	public static void main(String args[]) {
		
		JOptionPane.showMessageDialog(null, "Play Your Best Guess!!");
		int pickAnumber = Integer.parseInt(JOptionPane.showInputDialog("Pick an integer from 1 to 10"));
		int numberGuess = 0;
		int randomNumber = new Random().nextInt(10) + 1;
		
//		numberGuess++;
		
		while (pickAnumber != randomNumber) {

			pickAnumber = Integer.parseInt(JOptionPane.showInputDialog("Give it another shot..."
					+ "Pick an integer from 1 to 10"));
			numberGuess++;
			
		}
		
		JOptionPane.showMessageDialog(null, "You guessed correctly after "
				+ numberGuess + " trys!");
	}
}
