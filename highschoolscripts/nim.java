
/**
 * Write a description of class nim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nim
{
    // instance variables - replace the example below with your own
  public static void main(String[] args) {
      System.out.println(Node(20,true).value);
      System.out.println(Node(18,true).value);
      System.out.println(Node(18,false).value);
      System.out.println(Node(0,true).value);
        
    }
    
    
    
}

 class Node{
    int sum;
    boolean turn;
    int value;
    
    Node( int sum, boolean turn){
        this.sum =sum;
        this.turn = turn;
        
        if(sum >= 21){
            if(turn){
                
                value =0;
                
            }else{
                
                value =1;
                
            }
            
        }else{
            Node child1 = new Node( sum +1, !turn);
            Node child2 = new Node(sum +2, !turn);
            
            if(turn){
                if(child1.value ==0 && child2.value ==0){
                    value =0;
                    
                }
                
                value =1;
                
            }else{
                                if(child1.value ==0 && child2.value ==0){
                    value =1;
                    
                }
                
                value =0;
                
                
                
            }
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
