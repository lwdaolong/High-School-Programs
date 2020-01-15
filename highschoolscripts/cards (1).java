
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class cards{
    public static void main (String args[]) {
        Card test = new Card();
        System.out.println(test.getName());
        System.out.println(test.getSuit());
        System.out.println(test.getRank());
        
    }
}


 class Card
{
    private int suit; //0-3
    private int rank; //0-13
    private String name = "";

    Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
        name = Name(this.suit, this.rank);
    }
    
    Card(){
        suit = 2;
        rank =2;
        name = Name(this.suit, this.rank);
    }
    
    private  String Name(int suit, int rank){
        if( rank < 11)
        {
            name += this.rank;
        }else if(rank ==11){
            name += "Jack";
        }else if(rank ==12){
            name += "Queen";
        }else if(rank ==13){
            name += "King";
        }else if(rank ==14){
            name += "Ace";
        }
        
        if(suit ==1){
            name += " of " + "Diamonds";
            
        }else if (suit == 2){
            name += " of " + "Clubs";
            
        }else if (suit == 3){
            name += " of " + "Hearts";
            
        }else if (suit == 4){
            name += " of " + "Spades";
            
        }
        return name;
    }
    
    public int getRank(){
        return rank;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public String getName(){
        return name;
    }
}
