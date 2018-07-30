// Bluej project: finding_the_first_match
// Write a program that finds the first word in Alice In Wonderland
// that is longer than a given number of characters.

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        final int THRESHOLD = 9;
        
        int count = 0;
        while(in.hasNext()) // look 
        {
            String word = in.next(); // capture word
            if(word.length() > THRESHOLD) // check if its longer than 
            {
                longWord = word;
                found = true;
                count++;
                System.out.println("Here is a long word: " + longWord);
            }
        }
        System.out.println("There are " + count + " long words in this text");
    }
}
