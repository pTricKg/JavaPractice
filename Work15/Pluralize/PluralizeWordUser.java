import java.util.Scanner;
/**
 * Write a description of class PluralizeWordUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PluralizeWordUser
{
    static String user = "";
    
    public PluralizeWordUser(String user) 
    {
       this.user = user;
    }
    
    public static void main(String[] args)
    {
        boolean value = false;
        Scanner word = new Scanner(System.in);
        while (!value)
        {
            System.out.print("Enter word to pluralize or type quit now to stop: ");
            user = word.next().toLowerCase();
            
            if (user.length() >= 0)
            {
                if (user.equals("quit"))
                {
                    value = true;
                }
                else
                {
                    System.out.println(new PluralizeWordUser(user).getPluralForm());
                }
            }
            else if (word == null) 
            {
                System.out.println("Please enter word to pluralize");
            }
            
        }
    }
  
    
    public String getPluralForm()
    {
        
        /**
         Forms the plural of this word.
         @return the plural, using the rules for regular nouns
        */
        // y preceded by a consonant, add ies.
        // y preceded by a vowel, add an s.
        // o, s, sh, or ch, add es
        // or add an s.
        int last = user.length() - 1; //get last letter

        if (is(last, "y") && isConsonant(last - 1))//plural y with preceding consonant
        {
            return user.substring(0, last) + "ies";
        }
        else if (is(last, "o") || is(last, "s")
            || is(last, "h") && is(last - 1, "s") 
            || is(last, "h") && is(last - 1, "c")) // plural o.s,sh,ch
        {
            return user + "es";
        }
        else
        {
            return user + "s";
        }
        
    }

    

    /**
    Tests whether the ith letter is a vowel.
    @param i the index of the letter to test
    @return true if the ith letter is a vowel
     */
    public boolean isVowel(int i)
    {
    return is(i, "a")
        || is(i, "e")
        || is(i, "i")
        || is(i, "o")
        || is(i, "u");
    }

    /**
    Tests whether the ith letter is a consonant.
    @param i the index of the letter to test
    @return true if the ith letter is a consonant
     */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }
    
    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return user.substring(i, i + 1).equals(letter);
    }
    
}
