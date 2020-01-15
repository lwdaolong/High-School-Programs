
/**
 * Write a description of class ps002 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ps002
{

    public static void main(String[] args){
        int[] test = roll(10);
        
                 for(int i =0; i< test.length;i++)
         System.out.print(test[i]);
        
        System.out.println(" ");
        System.out.println(getProb(test));
         
        
    }
    
    static int[] roll(int rollnum) {
        int[] a = new int[rollnum];
       for(int i = 0;i <rollnum;i++){
        int r1 = (int)(Math.random() * 6) +1;
        int r2 = (int)(Math.random() * 6) +1;
        a[i] = r1+r2;
           
    }
    return a;
}

static double getProb( int[] a){
        int timesuccess = 0;
        int totalflips = a.length;
        for(int i = 0; i <a.length;i++){
            if(a[i] >= 6){
                timesuccess++;
            }
        }
        
       return (double)(timesuccess)/(double)(totalflips);
    }
}

