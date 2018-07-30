package com.javaPractice.pTricKg;


import javax.swing.JFrame;
/* pop up window eg 
 * nothing there */

public class exampJframe {
	public static void main(String args[]) {
		JFrame myFrame = new JFrame();
		String myTitle = "Blank Frame";
		
		myFrame.setTitle(myTitle);
		myFrame.setSize(300, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		
	}
	
	
	
}
