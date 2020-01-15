import java.util.*;
public class node111
{     
   public static void main(String[] args) {
        Node n = new Node(5);
        Node head = n;
        for(int i =0; i < 5; i++){
            n.next = new Node((int)(Math.random()*10));
            n  = n.next;
            
        }
        n= head;
        while( n != null){
             System.out.println(n.value);
             n= n.next;
            
        }
        n = head;
        
        System.out.println(" ");
        
        System.out.println(getNode(3, n).value);
       
    }
    
    public static Node getNode(int t, Node head){
            Node n = head;
        for(int i =0; i < t; i++){
            n  = n.next;
            
        }
        
        if(n != null)
        return n;
        else
           return null;
    
    
    
}

}

  class Node {
    public Node next;
    int value;
    Node(int a) {
    value = a;
    next = null;
    }
}


