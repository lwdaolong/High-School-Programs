
/**
 * Write a description of class dectoBIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dectoBIN
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
            System.out.println(dectobin(6));
        }
        
        public static String dectobin(int a){
            int c =0;
            
                
            while(Math.pow(2,c) < a){
           
                    c++;

            }

            if(c==0 && a ==1){
                return "1";
            }else if 
            (c==0 && a ==0){
                return "0";
            }
            else if((a-Math.pow(2,c)) ==1 && c>0){
                return "1" + dectobin(a-2);
                
            }else {
                return "0" + dectobin(a-2);
                
            }
            
            //((a-Math.pow(2,c)) ==0 && c>0)
        }
    }



