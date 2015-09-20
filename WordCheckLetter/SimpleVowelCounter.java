import java.util.Scanner;
/**
 * Write a description of class Simple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleVowelCounter
{
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        System.out.print("Enter word: ");
        String user = word.next().toLowerCase();
        int i;
        int count = 0;
        for (i = 0; i < user.length(); i++)
        {
            String letter = user.substring(i, i + 1);
            if ("aeiou".contains(letter))
            {
                count++;
            }
            
        }
        System.out.println(count + " vowels");
    }
    
}
