package com.javaPractice.pTricKg;

import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount = new Account();
		Account yourAccount = new Account();
		
//		myAccount = new Account();
//		yourAccount = new Account();
		
		myAccount.name = "ptrickg";
		myAccount.address = "123 Cyberspace Street";
		myAccount.balance = 24.12;
		
		yourAccount.name = "Jane";
		yourAccount.address = "123 Spacecyber Street";
		yourAccount.balance = 62.31;
//		calling method from Account display
		myAccount.display();
		
		out.print(" plus $");
		out.print(myAccount.getInterest(5.00));
		out.println(" interest ");
		
//		System.out.println();
		
		yourAccount.display();
//		calling method from Account getInterest
		double yourInterestRate = 7.00;
		out.print(" plus $");
		double yourInterestAmount = yourAccount.getInterest(yourInterestRate);//return double value from getInterest
		out.print(yourInterestAmount);
		out.println(" interest ");
				
//		out.print(myAccount.name);
//		out.print("(");
//		out.print(myAccount.address);
//		out.print(") has $");
//		out.print(myAccount.balance);
//		out.println();
//		
//		out.print(yourAccount.name);
//		out.print("(");
//		out.print(yourAccount.address);
//		out.print(") has $");
//		out.print(yourAccount.balance);
//		out.println();
		
		
	}
}
