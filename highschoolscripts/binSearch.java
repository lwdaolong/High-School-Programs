import java.util.*;
public class binSearch
{
    public static void main(String[] args) {
        Student[] arr = new Student[18];
        arr[0] = new Student("Joe Anshel", 18181, 1991);
        arr[1] = new Student("Matt Englehardt", 18280, 1994);
        arr[2] = new Student("Tracy Holt", 18388, 1992);
        arr[3] = new Student("Anne Westfall", 18817, 1993);
        arr[4] = new Student("Kevin Snow", 19009, 1989);
        arr[5] = new Student("Meghan Peckis", 19083, 1992);
        arr[6] = new Student("Clifton Chang", 19102, 1993);
        arr[7] = new Student("Jim Emmons", 19181, 1992);
        arr[8] = new Student("Waylon Dalton", 19475, 1995);
        arr[9] = new Student("Marcus Cruz", 19981, 1993);
        arr[10] = new Student("Eddie Randolph", 20181, 1999);
        arr[11] = new Student("Justine Henderson", 20183, 1990);
        arr[12] = new Student("Thalia Cobb", 20199, 1990);
        arr[13] = new Student("Angela Walker", 20454, 1991);
        arr[14] = new Student("Joanna Shaffer", 20589, 1992);
        arr[15] = new Student("Mathias Little", 20607, 1991);
        arr[16] = new Student("Lia Shelton", 21100, 1995);
        arr[17] = new Student("Jonathon Sheppard", 21712, 1997);
        
        System.out.println(binsearch(20589,arr).name);
    }
    
    
    public static Student binsearch(int id, Student[] a){
        int i =0; 
        int l =0;
        int r =a.length-1 ;
        while( a[i].id != id){
            if(id > a[(l+r)/2].id){
                l = (l +r)/2;
                i =l;
            }else{
                r=  (l +r)/2;
                i=r;
            }
            

        }
        return a[i];
    }

    
}

 class Student{
    String name;
    int id;
    int eyear;
    
    Student(String name, int id, int eyear){
        this.name = name;
        this.id = id;
        this.eyear= eyear;
        
    }
    
    
}