import java.util.Scanner;
/**
 * Write a description of class PluralizeWordUserTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PluralizeWordUserTest
{
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        System.out.print("Enter word: ");
        String user = word.next().toLowerCase();
        
        System.out.println(new PluralizeWord(user).getPluralForm());
         
    }
}
