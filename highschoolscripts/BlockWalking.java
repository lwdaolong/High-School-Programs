
/**
 * Write a description of class BlockWalking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlockWalking
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
     System.out.println(blockwalk(2,2));   
    }
    
    public static int blockwalk(int x, int y){
        if(x ==0 ){
            return 1;
            
        }if(y==0){
            return 1;
        }
        return (blockwalk(x-1,y) + blockwalk(x,y-1));
    }
}
