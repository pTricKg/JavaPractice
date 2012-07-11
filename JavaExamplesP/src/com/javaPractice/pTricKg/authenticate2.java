package com.javaPractice.pTricKg;
import static java.lang.System.out;

import java.util.Scanner;


class authenticate2 {
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Username: ");
		String username = keyboard.next();
		
		if (username.equals("pTricKg")) {
			out.print("Password: ");
			String password = keyboard.next();
			
			if (password.equals("yerMomsShoes")) {
			out.println("The force is with you!");
			}else {
			out.println("you're wrong");
			}
		}else {
			out.println("Unknown user");
		}
		}
		
	}


