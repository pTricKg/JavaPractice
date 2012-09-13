package com.javaPractice.Team;

import java.text.DecimalFormat;

public class Player {
	private String name; //declaring fields
	private double average;
	
	public Player(String name, double average) {
		this.name = name; //constructing new instances of class
		this.average = average;
		
	}
	public String getName() {
		return name; //accessors for fields
	}
	public double getAverage() {
		return average;
	}
	public String getAverageString() {  //method to return average in String
		DecimalFormat decFormat = new DecimalFormat();
		decFormat.setMaximumIntegerDigits(0);
		decFormat.setMaximumFractionDigits(3);
		decFormat.setMinimumFractionDigits(3);
		return decFormat.format(average);
	}
}
