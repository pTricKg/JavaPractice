package com.javaPayroll.pTricKg;


public class DoPayrollTypeF {
	
	public static void main(String arg[]) {
		
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		
		ftEmployee.setName("Sith Lord");
		ftEmployee.setJobTitle("Emperor");
		ftEmployee.setWeeklySalary(900000.00);
		ftEmployee.setBenefitDeduction(750.00);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		System.out.println();
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		
		ptEmployee.setName("Anakin Skywalker");
		ptEmployee.setJobTitle("Apprentice");
		ptEmployee.setHourlyRate(15.00);
		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(18));
		System.out.println();
		
		PartTimeWithOT ptoEmployee = new PartTimeWithOT();
		
		ptoEmployee.setName("Padme Skywalker");
		ptoEmployee.setJobTitle("Senator");
		ptoEmployee.setHourlyRate(12.50);
		ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));
		
	}

}
