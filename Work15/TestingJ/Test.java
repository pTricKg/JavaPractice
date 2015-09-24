
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test {
    //     static String letterGrade = "F";
    //     static int grade = 95;
    

        public int largestPowerOf2(int n)
        {
        //TODO: implement this method.
        int x = 0;
        while (x < n)
        {
            x = x *= 2;

        }
        return x/2;
    }
    }


//          int n = 1;
//          while (n < 100)
//          {
//             n = 2 * n;
//             System.out.print(n + "");
//             }
//         if (grade >= 90){letterGrade = "A";}
//         if (grade >= 80){letterGrade = "B";}
//         if (grade >= 70){letterGrade = "C";}
//         if (grade >= 60){letterGrade = "D";}
//         System.out.println(letterGrade);

