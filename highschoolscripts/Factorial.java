
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
     public static void main(String[] args) {
    // if there is ever a loose < or >, the code breaks
      System.out.println(realfac(5));
      //  System.out.println(replace("In the beginning, <proper noun> created the <nouns> and ...","Bob"));
    }
    
    public static int realfac(int n){
        if( n <1){
            return 1;
        }else
        return n* realfac(n-1);
        
        
    }
}


