
public class PluralizeWord
{
    private String letters;

    public PluralizeWord(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
    Forms the plural of this word.
    @return the plural, using the rules for regular nouns
     */
    public String getPluralForm()
    {
        // y preceded by a consonant, add ies.
        // y preceded by a vowel, add an s.
        // o, s, sh, or ch, add es
        // or add an s.
        int last = letters.length() - 1; //get last letter

        if (is(last, "y")) //plural y 
        {
            if (isConsonant(letters.length() - 2)) // with consonant
            {
                return letters.substring(0, last) + "ies";
            }
            
        }
        else if (is(last, "o") || is(last, "s")) // plural o.s,sh,ch
        {
            return letters + "es";
        }
        else if (is(last, "h"))
        {
            if (is(letters.length() - 2, "s") || is(letters.length() - 2, "c"))
            {
                return letters + "es";
            }
            
        }
        return letters + "s";
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
        return letters.substring(i, i + 1).equals(letter);
    }
}
