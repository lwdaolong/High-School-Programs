import java.util.*;
public class a
{
    public static void main(String[] args) {
        Int[] arr = new Int[12];
        for(int a = 0; a < arr.length; a++) {
            arr[a] = new Int((int)(Math.random() * 20));
        }
        
        ArrayList <Int> list = insSort(arr);
        
                for(int l =0; l< arr.length;l++){
            System.out.println(arr[l].i);
        }
        
        System.out.println("---------");
        
        for(int l =0; l< list.size();l++){
            System.out.println(list.get(l).i);
        }
    }
    static ArrayList <Int> insSort(Int[] array) {
        ArrayList <Int> z = new ArrayList();
       for(int a=0; a< array.length; a++){
           int index =-1;
           for(int j =0; j < z.size();j++){
               if(array[a].i <= z.get(j).i){
                   index = j;
                   break;
                }
               
            }
            if( index == -1){
                z.add(array[a]);
            }else{
                z.add(index, array[a]);
            }
            
        }
        
        return z;
    }
}
class Int {
    public int i;
    Int(int i) {
        this.i = i;
    }
}