
/**
 * Write a description of class diceGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class diceGame
{
    public static void main(String args[]) {
        Scanner reader = new Scanner (System.in); 
        int pdie1, pdie2, cdie1, cdie2;
        int cguess;
        int pscore, cscore;
        int ptotal =0, ctotal = 0;
        Random r = new Random();
    
        while(ptotal <=50 && ctotal <= 50){
            pscore = 0;
            cscore = 0;
            pdie1 = (1 + r.nextInt(6));
            pdie2 = (1 + r.nextInt(6));
            cdie1 = (1 + r.nextInt(6));
            cdie2 = (1 + r.nextInt(6));
            
            pscore += pdie1 + pdie2;
            cscore += cdie1 + cdie2;
            System.out.print("Guess your roll: ");
            int a = reader.nextInt();
            if (a == pscore){
                pscore = 2* pscore;
            }
            System.out.println("Your dice: " + pdie1 + ", " + pdie2 + " = " + (pdie1 + pdie2));
            cguess = (1 + r.nextInt(12));
            if (cguess == cscore){
                cscore = 2* cscore;
            }
            System.out.println("I guess " + cguess);
            System.out.println("My dice: " + cdie1 + ", " + cdie2 + " = " + (cdie1 + cdie2));
            System.out.println("Your score: " + pscore);
            System.out.println("My score: " + cscore);
            ptotal += pscore;
            ctotal += cscore;
            System.out.println("Your total: " + ptotal);
            System.out.println("My total: " + ctotal);
            if(ptotal > ctotal){
                            System.out.println("You're winning!");
                
            } else if ( ptotal == ctotal){
                  System.out.println("We're tied!");
                
            } else{
                System.out.println("I'm winning!");
            }
            
            
         
        }
        if(ptotal > ctotal)
        System.out.println("You win!");
        else
        System.out.println("I win");
    }
}
