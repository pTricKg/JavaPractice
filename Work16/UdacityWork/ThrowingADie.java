// A program that simulates tossing a die 100 times. 
// It prints the number of times you roll a 6. 
import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        Random generator = new Random(42);
        
        // YOUR CODE HERE
        // Write a loop that simulates 100 die rolls. 
        // generate 100 random ints using generator. 
        // the ints should have values 1,2,3,4,5, or 6
        // Print the number of 6s rolled. 
        
        System.out.println();
        int count = 0;
        for(int i = 0; i < 100; i++)
        {
            int r = generator.nextInt(6) + 1;
            
            if( r == 6)
            {
                count++;                
            }
            
    }
    System.out.println("Count of 6: " + count);
    }
}
