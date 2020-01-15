
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main1
{
      public static void main(String[] args) {
   /*    int[] arr = new int[4];
       for(int i = 0; i< arr.length; i++){
           arr[i] = (int)(Math.random() * 100) ;
           
        }
        
             for(int j = 0; j< arr.length; j++){
           System.out.println(arr[j]);
           
        }  
        
        System.out.println(" ");
        */
        
               int[] arr1 = new int[30];
       for(int i = 0; i< arr1.length; i++){
           arr1[i] = (int)(Math.random() * 100) ;
           
        }
        
             for(int j = 0; j< arr1.length; j++){
           System.out.println(arr1[j]);
           
        }  
        
              System.out.println(" ");
        
        int[] arr2 = mergesort( arr1);
                     for(int j = 0; j< arr2.length; j++){
           System.out.println(arr2[j]);
           
        }
          
    }
    
    public static int[] mergesort(int[] tmp){
        if(tmp.length <2){
            
            return tmp;
            
        }
        int a2;
        int b2;
        
        if(tmp.length %2 ==0){
            a2 = tmp.length/2;
            b2 = a2;
            
        }else{
            a2 = tmp.length/2;
            b2 = a2 +1;
            
        }
            int[] left = new int[a2];
            int[] right = new int[b2];
            
            for(int i =0; i< a2 ;i++){
                left[i] = tmp[i];
            }
            int k =0;
            for(int j = a2 ;j< tmp.length ; j++){
                
                right[k ] = tmp[j];
                k++;
            }
        
        left = mergesort(left);
        right = mergesort(right);
        
        return merge(left,right);
    }
    
    
    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i =0;
        int j =0;
        int k =0;
        while( i< a.length && j <b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else if( b[j] < a[i]){
                c[k] = b[j];
                j++;
                k++;
            }else{
                c[k] = b[j];
                k++;
                c[k] = a[i];
                i++;
                j++;
                k++;
            }
        }
        
        while( i< a.length){
            c[k] = a[i];
            k++;
            i++;
        }
        
        while( j < b.length){
            c[k] = b[j];
            k++;
            j++;
            
        }
        return c;
    }
}
