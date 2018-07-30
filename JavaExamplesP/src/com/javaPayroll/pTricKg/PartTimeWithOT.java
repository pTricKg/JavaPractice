package com.javaPayroll.pTricKg;

public class PartTimeWithOT extends PartTimeEmployee {
	
	@Override
	public double findPaymentAmount(int hours) {
		
		if(hours <= 40) {
			return getHourlyRate() * hours;
		}else {
			return getHourlyRate() * 40 + getHourlyRate() * 2 * (hours - 40);
		}
	}

}
