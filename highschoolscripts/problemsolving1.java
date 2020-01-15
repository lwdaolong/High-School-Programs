
/**
 * Write a description of class problemsolving1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class problemsolving1
{

     public static void main(String[] args){
        int [] test = flip(1000);
         for(int i =0; i< test.length;i++)
         System.out.print(test[i]);
        
        System.out.println(" ");
        System.out.println(getProb(test));
         
    }
    
    static int []  flip(int timesflipped) {
        int[] a = new int[timesflipped];
        for(int i = 0; i < timesflipped; i++){
            double m = Math.random();
            if(m<0.5){
                a[i] = 0;
            }else{//heads are 1, tails are 0
            a[i] = 1;
        }
        }
        return a;
    }
    
    
    static double getProb( int[] a){
        int timesuccess = 0;
        int totalflips = a.length;
        for(int i = 0; i <a.length;i++){
            timesuccess += a[i];
        }
        
       return (double)(timesuccess)/(double)(totalflips);
    }
}
