
/**
 * Write a description of class ps07 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ps07
{
    static void guessNumberGame(){
        Scanner reader = new Scanner (System.in); 
        Random r = new Random();
        int n = r.nextInt(101); // n is on [0, 100]
        boolean numGuessed = false;
        System.out.println("I'm thinking of a number between 0 and 100, try and guess it!");
        while(numGuessed == false){
            int a = reader.nextInt(); 
            if( a > n){
                System.out.println("Guess a lower number");
            }
            if( a < n){
                System.out.println("Guess a higher number");
            }
            if( a == n){
                numGuessed = true;  

            }
        }
        System.out.println("You Win!");
    }
}
