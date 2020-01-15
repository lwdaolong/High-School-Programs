
/**
 * Write a description of class what here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class what
{
    public static void main(String[] args) {
        int[] arr = {10,9,5,0,1,3,6,2,132,26,9,123,4535,8,7};
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
        arr = sort(arr);
                for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+ ",");
        }
                System.out.println(" ");
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(mean(arr));
        System.out.println(median(arr));
       // System.out.println(mode(arr));
    }
    static String readFile(String filename)
    {
        String content = null;
        File file = new File(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {e.printStackTrace();} 
        return content;
    }
    static int[] nums (String s) {
        String[] contents = s.split(",");
        int [] arr = new int[contents.length];
        for(int i = 0; i < contents.length; i++) {
            arr[i] = Integer.parseInt(contents[i]);
        }
        return arr;
    }
    
    public static int[] sort(int[] arr){
                for(int i = 0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1])
            {
                for(int s = 0; s<arr.length-1;s++){
                    if(arr[s] > arr[s+1]){
                        int temp = arr[s];
                        arr[s] =arr [s+1];
                        arr[s+1] = temp;
                        s =-1;
                    }
                }
            }
            
        }
        return arr;
    }
    
public static int min( int[] arr){
    return arr[0];
}

public static int max( int[] arr){
    return arr[arr.length-1];
}

public static double mean( int[] arr){
    double total = 0;
    for(int i = 0; i< arr.length;i++){
        total+= arr[i];
        
}
    return (total/ (double)arr.length);
}

public static int median(int[] arr){
    if(arr.length % 2 ==0){
          int d = arr.length/2;
          return (arr[d] + arr[d+1])/2;
    }else{
        int s = arr.length/2;
        return arr[s];
    }
}
}
