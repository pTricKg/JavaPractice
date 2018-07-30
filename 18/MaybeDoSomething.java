import java.lang.*;
import java.util.*;

public class MaybeDoSomething {
    public static void main(String[] args) {
        System.out.println("Hello you sleepy mutha!\n");

        FizzBuzz();

        ScanTest();
        
    }
    public static void FizzBuzz(){
        for(int i = 1; i <= 100; i++){
            
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by 3 and 5 so, Fizz Buzz!");

            }
            else if(i % 3 == 0){
                System.out.println(i + " is divisible by 3 so, Fizz!");
            }
            else if(i % 5 == 0){
                System.out.println(i + " is divisible by 5 so, Buzz!");
            }
            else{
                System.out.println(i + " is a dud!!");
            }
        }
    }
    public static void ScanTest(){
        //Add scanner to take user input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to FizzBuzz?");
        String answer = sc.next();
        System.out.println(answer + " means yes!!!!  Hahaahaaha!!!!");
        sc.close();
    }

}