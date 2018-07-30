import static java.lang.System.out;;
/*
 * * FizzBuzz.java
 * 
 * Copyright 2016 pTricKg <ptrickg@ptrickg-MP061>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

public class FizzBuzz {
	
	public static void main (String args[]) {
		
		int num = 1;
		int fizzCount = 0;
		int buzzCount = 0;
		int fizzBuzzCount = 0;
		
		while(num <= 100){
			
			if(num % 3 == 0 && num % 5 == 0){
				fizzBuzzCount += 1;
				out.println(num + "= FizzBuzz");
			}
			else if(num % 3 == 0){
				fizzCount += 1;
				out.println(num + "= Fizz");
			}
			else if(num % 5 == 0){
				buzzCount += 1;
				out.println(num + "= Buzz");
			}
			else{
				out.println(num);
			}
			num += 1;
		}
		
		out.println("End of Line\n");
		out.println("Fizz Count: " + fizzCount);
		out.println("Buzz Count: " + buzzCount);
		out.println("Fizz Buzz Count: " + fizzBuzzCount);
	}
	
}

