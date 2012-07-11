package com.javaPractice.pTricKg;
import javax.swing.JOptionPane;


public class authenticate {
	public static void main(String args[]) {
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		
//		int howMany = Integer.parseInt(JOptionPane.showInputDialog("How Many?"));
//		double howManyTwo = Double.parseDouble(JOptionPane.showInputDialog("How Many..?"));
		
		if (
			username != null &&
			password != null && 
			(
					(username.equals("pTricKg") && password.equals("yerMomsShoes"))
				)
				)
							{
				JOptionPane.showMessageDialog(null, "You're in!");
							}else{
								JOptionPane.showMessageDialog(null, "You're an evildoer! Go away!");
							}
	}
}
