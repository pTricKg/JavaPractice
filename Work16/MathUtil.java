import java.util.Scanner;

//Complete the method to return the product of
//all the numbers 1 to the parameter n (inclusive)

public class MathUtil
{

	public static void main(String[] arg) {
		MathUtil mth = new MathUtil();
		double i = mth.averageScore();
		System.out.println(i);

	}
	   public int product(int n)
	   {
		    // TODO: Complete the function to return
		    // the product of 1, ..., N-1, N
		    int i;
		    int p = 1;
		    
		    for (i = 1; i <= n; i++) {
		        p *= i;
		        
		    }
		    
		    return p;
		    
	   }

	// Complete this method to read integer scores from the user and find the average
	// Stop asking for input when the user enters a negative number.
	// Keep a running total and keep track of the number of entries,
	// then find and return the average

	// Be sure not to divide by 0. Return 0 if no scores are entered


		public double averageScore()
		{
		    System.out.print("Enter a score. -1 to quit: "); //get input from user
		    Scanner input = new Scanner(System.in);
		    int usr = input.nextInt(); //add input to variable
		    int avg = 0;
		    int scores = 0; //initalize scores, count, average for later
		    int count = 0;
		    
			if (usr != -1 && usr >= 0) {
						    	
			    count++;
			    scores = scores + usr;
			    avg = scores / count;
			    averageScore();
			    
			}
			else {
				
				return 0;
			}
			return avg;
		}	

   
}

