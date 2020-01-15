
/**
 * Write a description of class Fibbonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ackermann
{
      public static void main(String[] args) {
    // if there is ever a loose < or >, the code breaks
      System.out.println(ackermann(3,3));
      //  System.out.println(replace("In the beginning, <proper noun> created the <nouns> and ...","Bob"));
    }
    
    public static int ackermann(int m, int n){
        if(m==0){
            return n+1;
        }
        if(n==0 && m>0){
            return ackermann(m-1,1);
            
        }else{
            
            return ackermann(m-1,ackermann(m,n-1));
        }
    }
}
