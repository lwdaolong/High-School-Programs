
/**
 * Write a description of class booleanpuzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class booleanpuzzle
{
    // instance variables - replace the example below with your own
       public static void main (String args[]) {
        boolean[] lights = new boolean[101];

        for(int i = 1;i< lights.length;i++){ //i = ppl, s = lights #
            for(int s =1;s<lights.length;s++)
            {
                if(s%i ==0)
                lights[s] =! lights[s];
            }
        }
        
        for(int t =0; t< lights.length;t++){
            if(lights[t])
            System.out.println(t);
        }
    } 

    
    
}
