
/**
 * Write a description of class ps09 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ps09
{
    public static void main(String[] args) {
        int arr[] = new int[(int)(Math.random()*6+10)];
        for(int i=0; i < arr.length; i++){
             arr[i] = (int)(Math.random()*21) ;
            System.out.println(arr[i]);
        }
       
                    System.out.println("Min; " + min(arr));
                    System.out.println("IndexMin; " + indexmin(arr));
                    System.out.println("Max: " + max(arr));
                    System.out.println("Mean: " + mean(arr));   
                    System.out.println("Median: " + median(arr));
        // the array should be of size 10-15, inclusive
        // elements should be ints on [0, 20], inclusive
    }
    public static int min(int[] arr) {
        int tmp = 21;
               for(int i=0; i < arr.length; i++){
                  if (arr[i] < tmp)
                    tmp = arr[i];
        }
        return tmp;
    }
        public static int indexmin(int[] arr) {
        int tmp = 21;
        int index = 0;
               for(int i=0; i < arr.length; i++){
                  if (arr[i] < tmp)
                    {tmp = arr[i];
                        index = i;
        }}
        return index;
    }
    public static int max(int[] arr) {
                int tmp = 0;
               for(int i=0; i < arr.length; i++){
                  if (arr[i] > tmp)
                    tmp = arr[i];
        }
        return tmp;
    }
    public static double mean(int[] arr) {
                      int tmp = 0;
               for(int i=0; i < arr.length; i++){
                   tmp += arr[i];
                }
        return (double)tmp/arr.length;  
    }
    public static double median(int[] arr) {
        int lg[] = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            lg[i] = min(arr);
            arr[indexmin(arr)] = 21;
            
        }
        if(lg.length % 2 == 0)
        return ((lg[lg.length/2] + lg[lg.length/2 +1])/2);
        else{
                    return (lg[lg.length/2 + 1]);
        }
        
        
    }
}
