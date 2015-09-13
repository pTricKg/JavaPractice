/**
 * Takes user input for size of yard
 * in feet and converts to metric.
 */
//  1 foot = 0.3048 meters.

public class YardCalculator
{
    //Constants
    public static final double METERS_PER_FOOT = 0.3048;
    final double length;
    final double width;
    
    /**
     * Constructs a YardCalculator with the given parameters
     * @param the length of the yard
     * @param the width of the yard
     */
    public YardCalculator(double length, double width)
    {
        this.length = length * METERS_PER_FOOT;
        this.width = width * METERS_PER_FOOT;
        
    }

    /**
     * Gets the perimeter of the yard
     * @return the perimeter
     */
    public double perimeter()
    {
        double perimeter = (length * 2) + (width * 2);
        //System.out.println(perimeter);
        return perimeter;
    }

    /**
     * Gets the area of the yard
     * @return the area
     */
    public double area()
    {
        double area = length * width;
        //System.out.println(area);
        return area;
    }

     /**
     * Gets the diagonal of the yard
     * @return the diagonal
     */
    public double diagonal()
    {
        double diagonal = Math.sqrt(Math.pow(width,2) + Math.pow(length,2));
        //System.out.println(diagonal);
        return diagonal;
    }

}
