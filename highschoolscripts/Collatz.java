
/**
 * Write a description of class Collatz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collatz
{ static int temp =0;
    // instance variables - replace the example below with your own
      public static void main(String[] args) {
    // if there is ever a loose < or >, the code breaks
      System.out.println(col(5));
      //  System.out.println(replace("In the beginning, <proper noun> created the <nouns> and ...","Bob"));
    }

    public static int col(int n){
     if(n==1){
         return temp;
     
        }else if(  n%2 ==0){
            temp++;
            return col(n/2);
            
        }else{
            temp++;
            return col(3*n+1);
            
        }
    }
}
