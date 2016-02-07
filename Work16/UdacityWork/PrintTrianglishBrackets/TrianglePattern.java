// Print the following pattern of brackets: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // YOUR CODE HERE
        // Write nested loops so that on the first row
        // you print one pair of brackets and on the 
        // second row you print 2 pairs of brackets, and
        // so on...
        int numberOfRows = 5;
        
        for(int row = 1; row <= numberOfRows; row++)
        {
            for(int column = 0; column < row; column++)
            {
                
                    System.out.print("[]");
            }
         System.out.println();      
        }
    }
}
