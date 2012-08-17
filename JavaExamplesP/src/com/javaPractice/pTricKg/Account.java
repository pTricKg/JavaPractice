package com.javaPractice.pTricKg;

import static java.lang.System.out;

public class Account {
	private String name;
	private String address;
	private double balance;
	
	public void setName(String n) {
		if (!n.equals(""))
			name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String a) {
		if (!a.equals(""))
			address = a;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public double getBalance() {
		return balance;
	}
	public void display() {
		out.print(name);
		out.print("(");
		out.print(address);
		out.print(") has $");
		out.print(balance);
	}
	public double getInterest(double percentageRate) {
		return balance * percentageRate / 100.00;//executed when getInterest is called in UseAccount
	}
}
