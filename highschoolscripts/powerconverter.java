
/**
 * Write a description of class powerconverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class powerconverter
{
    public static void main(String[] args) {
        System.out.println(hextoDec("1AC"));
    }

    public static int binToDec(String s){
        int sum =0;

        for(int i =s.length()-1; i>=0;i--){
            int mult;
            if(s.charAt(i) == '1'){
                mult =1;
            }
            else{
                mult =0;
            }
            sum+= mult*Math.pow(2,i);
        }
        return sum;
    }

    public static int hextoDec(String s){
        int sum =0;
        for(int i = 0;i<s.length(); i++){
            int mult;
            switch(s.charAt(i)){
                case '1':
                mult =1;
                break;
                case '2':
                mult =2;
                break;case '3':
                mult =3;
                break;case '4':
                mult =4;
                break;case '5':
                mult =5;
                break;case '6':
                mult =6;
                break;case '7':
                mult =7;
                break;case '8':
                mult =8;
                break;case '9':
                mult =9;
                break;case 'A':
                mult =10;
                break;case 'B':
                mult =11;
                break;case 'C':
                mult =12;
                break;case 'D':
                mult =13;
                break;case 'E':
                mult =14;
                break;case 'F':
                mult =15;
                break;case '0':
                mult =0;
                break;
                default:
                mult= 0;
                break;

            
            }
            sum += mult*Math.pow(16,s.length()-1-i);
        }

        return sum;
    }
}
