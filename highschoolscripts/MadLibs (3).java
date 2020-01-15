
/**
 * Write a description of class MadLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MadLibs
{

      static String findMarker (String str) { 
        int startindex;
        int endindex;
        startindex = str.indexOf('<');
        endindex = str.indexOf('>');
        if( startindex < 0 || endindex <0){
            return null;

        }else 
        {
            return str.substring(startindex, endindex+1);
        }}
    
    public static void main(String[] args) {
    // if there is ever a loose < or >, the code breaks
       System.out.println(madLibzz("Today I am extremely <emotion>. During period < # between 1 and 8> , I got my <school subject> exam back and saw my score. I received a <# between 1 and 10> out of 25 on my assessment. I then proceeded to <verb> for an entire period, in an attempt to cope with my <medical condition>. Soon after, I went to the <location> and talked with <name> about their scores. They got a <# between 20 and 25>, making me feel <emotion> about myself. I then went to a <foreign language> class and realized that I can only speak English. Finally, I decided to jump off a <object> in an attempt to end it all. <Sadly, Thankfully, Tragically>, I failed."));
      //  System.out.println(replace("In the beginning, <proper noun> created the <nouns> and ...","Bob"));
    }

      static String replace(String str, String replacestring){
        int startindex;
        int endindex;
        startindex = str.indexOf('<');
        endindex = str.indexOf('>');
        String result;
        if( startindex == -1 || endindex ==-1){
            return null;

        }else 
        {
            result = str.substring(0,startindex) + replacestring + str.substring(endindex +1, str.length());
            return result;
        }
        }
        
      static String madLibzz(String mainstring){
                  Scanner sc = new Scanner(System.in);
          String finalstring = "";
          int startindex =0;
          int endindex = 0;
          boolean finished= false;
          do{
              if(findMarker(mainstring)  != null){
                  //System.out.println("So far your sentence madlibs is: " + finalstring + mainstring);
                  String temp;
              System.out.println(" Please give me a " + findMarker(mainstring));
              String st = sc.nextLine();
              temp = replace(mainstring, st);
              endindex = temp.indexOf(st) + st.length(); 
              finalstring += temp.substring(0,endindex);
              startindex = endindex;
              mainstring = temp.substring(startindex);
            }else 
            finished = true;
          
              
            }while(!finished);
            finalstring += mainstring;
          return "Your final madlibs is : " + finalstring;
        }
}

