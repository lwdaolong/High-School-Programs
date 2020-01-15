import java.util.*;
public class Rec
{
   public static void main(String[] args) {
       System.out.println(fib(8));
    }
    public static int fib(int n) {
        if(n <=1){
            return 1;
        }
      return fib(n-1) + fib(n-2);
    }
}