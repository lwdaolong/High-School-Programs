
/**
 * Write a description of class reverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*; 
public class reverse
{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");       
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println(reverse(st));
    }
    static String reverse (String s) {

        String rev = "";
        int charSlots = s.length() -1;
        for(int i = charSlots; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}
