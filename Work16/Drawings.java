
/**
 * Draw [] with given rows and columns
 * 
 * @author pTricKg
 * @version (a version number or a date)
 */
public class Drawings
{
    /**
     * Prints a rows by column array of blocks ([])
     * @param rows the number of rows of []
     * @param columns the number of columns of []
     */
     public void blockPrinter(int rows, int columns)
     {
         //TODO print the specified number of rows and columns of []
         for (int i = 0; i < rows; i++){
                for (int j = 0; j < columns; j++){
                    System.out.print("[]");
                } 
                System.out.println();
            }
     }
    
}
