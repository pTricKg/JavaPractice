import java.util.Scanner;
/**
 * Write a description of class Test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int count = 0;
        boolean e = true;
        if (e == true)
        {
            //System.out.print("Enter an integer: ");
            //your code goes here
            String u = in.next();
            //System.out.println(u);
            //int n = u.hasNextInt();
            int n = Integer.parseInt(u);
            while (in.hasNextInt())
            {
            if (n % 2 == 0)
            {
                count++;
            }
            else
            {
                System.out.println(count);
                e = false;
            }
        }
            
        }
        
    }
}
