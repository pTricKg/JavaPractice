import java.util.Scanner;
/**
 * Simply checking whether letter in given word
 * is a vowel or consonant
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordCheckLetter
{
    private String letters;

    public static void main(String[] args)
    {   
        String v = " is vowel";

        Scanner word = new Scanner(System.in);
        System.out.print("Give me a word and \ni'll tell you if each letter is a vowel  \nor not: ");
        String user = word.nextLine();

        System.out.println("\nYou input: " + user);
        user = user.toLowerCase().replaceAll("\\s","");
        System.out.println(user);

        int l;
        int cCount = 0;
        int vCount = 0;
        for (l = 0; l < user.length(); l++)
        {
            System.out.println("\nLetter of your word at index " + l);
            if (user.substring(l, l + 1).equals("a"))
            {
                System.out.println(user.substring(l, l + 1) + v);
                //System.out.println(v);
                vCount++;
            }
            else if (user.substring(l, l + 1).equals("e"))
            {
                System.out.println(user.substring(l, l + 1) + v);
                //System.out.println(v);
                vCount++;
            }
            else if (user.substring(l, l + 1).equals("i"))
            {
                System.out.println(user.substring(l, l + 1) + v);
                //System.out.println(v);
                vCount++;
            }
            else if (user.substring(l, l + 1).equals("o"))
            {
                System.out.println(user.substring(l, l + 1) + v);
                //System.out.println(v);
                vCount++;
            }
            else if (user.substring(l, l + 1).equals("u"))
            {
                System.out.println(user.substring(l, l + 1) + v);
                //System.out.println(v);
                vCount++;
            }
            else 
            {
                System.out.println(user.substring(l, l + 1) + " is consonant");
                //System.out.println(" is consonant");
                cCount++;
            }

        }

        //         System.out.println(user.isVowel(0));
        //         System.out.println(user.isVowel(1));
        //         System.out.println(user.isVowel(2));
        //         System.out.println(user.isVowel(3));
        //         System.out.println(user.isVowel(4));
        System.out.println("\nNumber of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }

}