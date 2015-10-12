//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 10 3 8 1, 2 9, the output will be

//10
//1

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to 
// Integer.MAX_INTEGER before the loop.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 3" for some tips on 
// how to begin.

import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int val = 0;
        while (true)
        {
            System.out.print("Enter an integer: ");
            if (in.hasNextInt())
            {
                val = in.nextInt();
            }
            else
            {
                System.out.println(min);
                System.out.println(max);
                break;
            }
            if (val < min)
            {   
                min = val;
            }
            if (val > max)
            {
                max = val;
            }

        }

    }
}
