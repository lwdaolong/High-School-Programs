import java.util.*;
public class demo
{
    public static void main(String[] args) {
        ArrayList <Game> list = new ArrayList<>();
            list.add(new VideoGame("League"));
             list.add(new VideoGame("GTA 5"));
              list.add(new VideoGame("Smash"));
               list.add(new BoardGame("Monopoly"));
                list.add(new BoardGame("Chess"));
                 list.add(new SportGame("Vball"));
                  list.add(new SportGame("WOpo"));
            

        
        int c =0;
for(int i =0; i < list.size();i++){
    if(list.get(i) instanceof VideoGame){
        c++;
    }
    System.out.println(list.get(i).getName()); 
}
        System.out.println(c);
    }
}

class Program {
    String type;    // macOS, Windows, iOS, Android
    Program(String type) {
        this.type = type;
    }
    

    // other methods not shown
}
class VideoGame extends Program implements Game{
    
    VideoGame(String  name){
        super(name);
    }
    
    public String getName(){
        return type;
    }
}

class Activity {
    String name;
    Activity(String name) {
        this.name = name;
    }

    // other methods not shown
}
class BoardGame extends Activity implements Game{
    
        BoardGame(String  name){
        super(name);
    }
         public String getName(){
        return name;
    }
}
class Sport {
    String name;
    Sport(String name) {
        this.name = name;
    }
       

    // other methods not shown
}
class SportGame extends Sport implements Game{
    
            SportGame(String  name){
        super(name);
    }
    
    public String getName(){
        return name;
    }
}

interface Game{
    public String getName();
    
}

