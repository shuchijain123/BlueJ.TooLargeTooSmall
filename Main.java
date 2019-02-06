
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main (String args[])
    {
        
        Random randomnumber = new Random();
        
        Scanner scanner = new Scanner(System.in);
        int computerValue = randomnumber.nextInt(5);
        int numberofTries=0;
        int success=0;
        int guess=0;
         
        
        int guessNext=0;
        while(success==0){
        System.out.println("Please guess a number between 1 and 10" );
        
        guess=scanner.nextInt();
        
        if(guessNext !=guess){
  

        numberofTries++;
        
        
    }
    guessNext=guess;
    //guess =scanner.nextInt();
        
        if(guess<1||guess>5){
        System.out.println("Invalid Number" );
    }
        else if (guess==computerValue)
        {
            System.out.println("Wow You won Your Number Matched and Tries are" + numberofTries);
            success++;
        }
        else if (guess<computerValue)
        {
             System.out.println("your guess is very low" );
        }
        
        else if (guess>computerValue){
            {
             System.out.println("your guess is very High" );
        }
        }
        
        
    }
}
    
}
