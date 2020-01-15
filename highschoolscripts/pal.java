
/**
 * Write a description of class pal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pal
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        System.out.println("racecar? " + isPalindrome("racecar"));
        System.out.println("poop? " + isPalindrome("poop"));
        System.out.println("anna? " + isPalindrome("anna"));
        System.out.println("civic? " + isPalindrome("civic"));
        System.out.println("kayak? " + isPalindrome("kayak"));
        System.out.println("madam? " + isPalindrome("madam"));
        System.out.println("level? " + isPalindrome("level"));
        System.out.println("dumb? " + isPalindrome("dumb"));
        System.out.println("happy? " + isPalindrome("happy"));
        System.out.println("kenny? " + isPalindrome("kenny"));
        System.out.println("casey? " + isPalindrome("casey"));
    }
    static boolean isPalindrome(String s) {
        int charSlots = s.length() - 1;
        for(int i = 0; i<= charSlots; i++){
            if(s.charAt(i) != s.charAt(charSlots - i)){
                return false;
            }
            
        }
        return true;    // placeholder, you need to write this
    }
}
