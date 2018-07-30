
// Bluej project: lesson6/average_fixed
// Update your program so that the user supplies at least one input.
// Use Q as a sentinel value.
// Start prompting for the sentinel value after the first input.
// If the user doesn't provide even the first input, print Error: No input

import java.util.Scanner;

public class AverageWithNegativeAndBadInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        System.out.print("Enter a value: ");
        
        if(in.hasNextDouble())
        {
            while (in.hasNextDouble())
            {
                double value = in.nextDouble();
                sum = sum + value;
                count++;
                System.out.print("Enter a value, Q to quit: ");
            }
            double average = sum / count;
            System.out.printf("Average: %.2f\n", average);
        }
        else
        {
            System.out.print("Error: no input");
        }
        
    }
}
