
/**
 * Write a description of class numfactors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numfactors
{
    public static void main(String[] args) {
        System.out.println("20: " + numFactors(20));
        System.out.println("24: " + numFactors(24));
                System.out.println("22: " + numFactors(22));
    }
    static int numFactors(int n) {
        int count = 0;
        for(int i =1; i<=n; i++){
            if(n%i ==0){
                count ++;
        }
    }
    return count;
}
}
