
/**
 * Write a description of class Sum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sum
{
    public int sum(int n)
    {
        int x = 0;
        
        for (int i = 2; i <= n; i += 2)
        {
            x += i;
        }
//         while (x < n)
//         {
//             
//             x = i * 2;
//             
//         }
        return x;
    }
}
