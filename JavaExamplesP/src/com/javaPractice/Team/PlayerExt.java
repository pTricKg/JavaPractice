package com.javaPractice.Team;

import java.text.DecimalFormat;

public class PlayerExt extends Player{
	private static int playerCount = 0;
	private static double totalOfAverages = .000;
	private static DecimalFormat decFormat = new DecimalFormat();
	
	static { //static initializer..don't let method calls dangle just inside class
		decFormat.setMaximumIntegerDigits(0);
		decFormat.setMaximumFractionDigits(3);
		decFormat.setMinimumFractionDigits(3);		
	}
	
	public PlayerExt(String name, double average) {
		super(name, average);
		playerCount++;
		totalOfAverages += average;
	}

	public static double findTeamAverage() {
		return totalOfAverages / playerCount;
	}
	
	public static String findTeamAverageString() {
		return decFormat.format(totalOfAverages / playerCount);
	}
}
