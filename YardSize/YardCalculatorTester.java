import java.util.Scanner;

public class YardCalculatorTester
{
    public static void main(String[] args)
    {
        // Asking for user input then convert string to double
        Scanner l = new Scanner(System.in);
        System.out.print("Length of your yard: ");
        String nameL = l.next( );
        Double userL = Double.parseDouble(nameL);

        Scanner w = new Scanner(System.in);
        System.out.print("Width of your yard: ");
        String nameW = w.next();
        Double userW = Double.parseDouble(nameW);
        
        // Final double values for calculator
        final double LENGTH = userL;
        final double WIDTH = userW;

        YardCalculator calculator = new YardCalculator(LENGTH, WIDTH);
        
        // Actual calculations
        double perimeter = calculator.perimeter();
        double area = calculator.area();
        double diagonal = calculator.diagonal();
        
        // Printing results
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
        

        

    }
}