package com.javaPractice.pTricKg;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class guessWindow {
	public static void main(String args[]) {
		Scanner pickNumber = new Scanner (System.in);
		
		int pickAnumber = Integer.parseInt(JOptionPane.showInputDialog("Pick an integer from 1 to 10"));
		//int inputNumber = pickNumber.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
	
		
		if (pickAnumber == randomNumber) {	
			JOptionPane.showMessageDialog(null, "Hooray! You got it right!!");
		}else {
			JOptionPane.showMessageDialog(null, "I was thinking of " + randomNumber);
			JOptionPane.showInputDialog("Try again!");
		}
		JOptionPane.showMessageDialog(null, "Thanks for playing!");
}
}


