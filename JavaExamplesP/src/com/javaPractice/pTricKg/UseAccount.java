package com.javaPractice.pTricKg;

import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount = new Account();
		Account yourAccount = new Account();
		
//		myAccount = new Account();
//		yourAccount = new Account();
		
		myAccount.setName(" ptrickg ");
		myAccount.setAddress("123 Cyberspace Street");
		myAccount.setBalance(24.12);
		
		yourAccount.setName(" Jane ");
		yourAccount.setAddress("123 Spacecyber Street");
		yourAccount.setBalance(62.31);
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
		
		double myInterest = myAccount.getInterest(5.00);
		double yourInterest = yourAccount.getInterest(7.00);
		
		out.printf("$%4.2f\n", myInterest);//formatting strings($display_symbol-
		out.printf("$%5.2f\n", myInterest);//%n=places to display number-
		out.printf("$%.2f\n", myInterest);//.nf=places two right of decimal-
		out.printf("$%3.2f\n", myInterest);//\n= new line
		out.printf("$%.2f $%.2f", myInterest, yourInterest);
				
		out.print(myAccount.getName());
		out.print("(");
		out.print(myAccount.getAddress());
		out.print(") has $");
		out.print(myAccount.getBalance());
		out.println();
		
		out.print(yourAccount.getName());
		out.print("(");
		out.print(yourAccount.getAddress());
		out.print(") has $");
		out.print(yourAccount.getBalance());
		out.println();
		
		
	}
}
