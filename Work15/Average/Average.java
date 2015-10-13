// Get average from user input
import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double num;

        do
        {
            System.out.print("Enter values to average then 0 to quit: ");
            num = in.nextDouble();
            if (num != 0)
            {
                count = count + 1;
                sum = num + sum;
            }
        }
        while (num > 0);
        
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
