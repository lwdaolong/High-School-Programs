
/**
 * Write a description of class magicsqr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class magicsqr
{
    // instance variables - replace the example below with your own
    
    
     public static void main(String[] args) {
          int[][] square = {
             {8,6,1},
             {4,2,9},
             {3,7,5}
            };
            
                      int[][] notsquare = {
             {8,6,5},
             {4,2,9},
             {3,7,5}
            };
         System.out.println(isMagicSquare(square));
         System.out.println(isMagicSquare(notsquare));
    }
    
    public static boolean isMagicSquare(int[][] arr){
        if(arr.length == arr[0].length){
            int sum =0;
            for(int i =0; i< arr[0].length;i++){
            sum+= arr[0][i];
        }
        
        int count =0;
        
        for(int r=0; r< arr.length; r++){
            count =0;
            for(int c=0; c<arr[0].length;c++){
                count += arr[r][c];
            }
            if(count !=sum){
                return false;
            }
        }
        
                for(int i=0; i< arr[0].length; i++){
            count =0;
            for(int j=0; j<arr.length;j++){
                count += arr[j][i];
            }
            if(count !=sum){
                return false;
            }
        }
        
            return true;
        }else{
            
            return false;
            
        }
        
        
        
    }
}
