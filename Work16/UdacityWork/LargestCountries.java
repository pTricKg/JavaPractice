// Bluej project: lesson6/largest_countries

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LargestCountries
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "population.txt"; // looking at..
        File inputFile = new File(filename); // creating file object
        Scanner in = new Scanner(inputFile); // scanning file object given

        String country = in.next(); // find next string from input
        double population = in.nextDouble(); // find next double from input
        double largest = population; // holder for largest population found

        String countryName = country; // initializing string for country name when found
        
        while (in.hasNext()) // looking through file while it has text to read
        {
            country = in.next(); // looking at strings and assigning
            population = in.nextDouble();  // looking at doubles and assigning
            if (population > largest) // check for largest
            {
                largest = population; // assigning largest to holder
                countryName = country; // assign country to holder
            }
        }
        System.out.println("The country with the largest population is: " + countryName);
        System.out.println("The largest population is: " + largest);
    }
}
