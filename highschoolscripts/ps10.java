
/**
 * Write a description of class ps10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ps10 {
    public static void main(String [] args) {
        Student[] arr = new Student[6];
        arr[0] = new Student("Thomas Jefferson", 3.30);
        arr[1] = new Student("John Adams", 3.50);
        arr[2] = new Student("Abraham Lincoln", 3.60);
        arr[3] = new Student("James Madison", 3.20);
        arr[4] = new Student("George Washington", 3.20);
        arr[5] = new Student("James Monroe", 3.40);

        System.out.println(getValedictorian(arr));
    }

    static String getValedictorian(Student[] arr) {
        double best = arr[0].getGPA();
        String name01 = arr[0].getName();
        for(int i =0; i< arr.length; i++)
        {
            if(arr[i].getGPA()> best)
            {
                best = arr[i].getGPA();
                name01 = arr[i].getName();
            }
        }return name01;
    }
}

class Student { 
    private String name;
    private double GPA;
    Student(String name, double GPA) { 
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}
