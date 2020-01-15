import java.io.*;
import java.util.*;

public class BBallStats
{
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<String>();
        try {
            FileInputStream fs = new FileInputStream("curry.txt");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                strings.add(strLine);
            }
            in.close();


     

        }catch (Exception e){}
        
                    Game[] games = new Game[strings.size()];
            for(int i=0; i< strings.size(); i++){
                games[i] = new Game(strings.get(i));

            }

               System.out.println(avgscorepergame(games));
            //   System.out.println(highestscoringgame(games));
    }

    public static double avgscorepergame(Game[] games){
        int sum =0;
        for(int i=0; i< games.length; i++){
            sum += games[i].get3pointersscored() *3;
            sum += games[i].get2pointersscored() *2;
            sum += games[i].get1pointersscored();
        }
        return (double)sum/(double)games.length;
    }
    
    

}

class Game{
    private int[] arr;

    Game(String s){
        arr= new int[6];
        for(int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(s.substring(0, s.indexOf(",")));
           // arr[i] =Double.parseDouble(s.substring(0, s.indexOf(",")));
            s= s.substring(s.indexOf(","+1));

        }
    }

    public int get3pointersscored(){
        return arr[0];

    }

    public int get3pointersattempts(){
        return arr[1];

    }

    public int get2pointersscored(){
        return arr[2];

    }

    public int get2pointersattempts(){
        return arr[3];

    }

    public int get1pointersscored(){
        return arr[4];

    }

    public int get1pointersattempts(){
        return arr[5];

    }
    
    public int getScore(){
        return arr[0]*3 + arr[2] *2 +arr[4];
    }
    
    

}