import java.util.Scanner;
/**
 * Simply checking whether letter in given word
 * is a vowel or consonant
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word
{
    private String letters;

    public static void main(String[] args)
    {   
        String v = " is vowel";

        Scanner word = new Scanner(System.in);
        System.out.print("Give me a word and \ni'll tell you if each letter is a vowel  \nor not: ");
        String user = word.nextLine();

        System.out.println("You input: " + user);
        user = user.toLowerCase().replaceAll("\\s","");
        System.out.println(user);

        int l;
        for (l = 0; l < user.length(); l++)
        {
            System.out.println("Letter of your word at index " + l);
            if (user.substring(l, l + 1).equals("a"))
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(v);
            }
            else if (user.substring(l, l + 1).equals("e"))
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(v);
            }
            else if (user.substring(l, l + 1).equals("i"))
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(v);
            }
            else if (user.substring(l, l + 1).equals("o"))
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(v);
            }
            else if (user.substring(l, l + 1).equals("u"))
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(v);
            }
            else 
            {
                System.out.print(user.substring(l, l + 1));
                System.out.println(" is consonant");
            }
        }

        //         System.out.println(user.isVowel(0));
        //         System.out.println(user.isVowel(1));
        //         System.out.println(user.isVowel(2));
        //         System.out.println(user.isVowel(3));
        //         System.out.println(user.isVowel(4));
    }

    
}