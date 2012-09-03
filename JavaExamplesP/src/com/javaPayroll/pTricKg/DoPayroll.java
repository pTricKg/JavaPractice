package com.javaPayroll.pTricKg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class DoPayroll {
	
	public static void main(String args[]) throws IOException {
		//placing new instance of .txt file into scanner
		Scanner empScanner = new Scanner(new File("EmployeeInfo.txt"));
		//loop to iterate .txt file variables
		for  (int empNum = 1; empNum <= 3; empNum++) {
			payOneEmployee(empScanner);//passes scanner values into payOneEmp' method
		}
		
	}
	
	static void payOneEmployee(Scanner pScanner) {
		Employee anEmployee = new Employee();
		
		anEmployee.setName(pScanner.nextLine());
		anEmployee.setJobTitle(pScanner.nextLine());
		anEmployee.cutCheck(pScanner.nextDouble());
		pScanner.nextLine();//needed to fetch value after nextDouble:
							//	nextDouble only reads number
	}
}
