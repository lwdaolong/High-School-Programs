import java.util.*;
public class mg {
    public static void main(String[] args) {
        String str = "Anavangot, Caldwell, DuPree, Getayalew, Heale, Hiramanek, Hiramanek, Hunt, Kandikattu, Kang, Kaviani, Kim, Konda, Kumar, Lam, Lee, Lin, Mavi, Raman, Richman, Vicente, Wang, Weiner, Woo, Xiao";
        ArrayList <Student> names = new ArrayList();
        String [] arr = new String[str.length() - str.replace(".", "").length()];
        arr = str.split(", "); 
        int count = 0;
        for(String s : arr) {
            names.add(new Student(s, count));
            count++;
        }
        
        System.out.println(simplesearch("Wang", names));
    }
    
    public static int simplesearch( String name, ArrayList <Student> names1){
for( int i =0; i< names1.size(); i++){
    if(names1.get(i).str.equals(name)){
        return i;
    }
    
}
            return -1;
        }
        
    }

class Student {
    int num;
    String str;
    Student (String str, int num) {
        this.num = num;
        this.str = str;
    }
}

