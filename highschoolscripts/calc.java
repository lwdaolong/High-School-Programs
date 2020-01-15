
import java.util.*; 
public class calc {
    public static void main (String args[]) {
        calculator();

    } 

    public static void calculator(){
        Scanner reader = new Scanner (System.in); 
        System.out.println("Calculator v. 0.5"); 
        System.out.print("Enter an integer: ");
        int a = reader.nextInt(); 
        System.out.print("Enter an integer: ");
        int b = reader.nextInt();

        System.out.print("Enter an operation: 1 = add, 2 = subtract, 3 = multiply, 4 = divide, 5 = remainder");
        int c = reader.nextInt();

        // use conditionals to determine which operation to use and to correctly calculate result
        // if c is 1, then use addition, etc.
        if (c ==1){
            int result = a + b;
            System.out.print("The sum of " + a + " and " + b + " is: "); 
            System.out.println(result); 

        } else if (c == 2){
            int result = a-b;
            System.out.print("The difference of " + a + " and " + b + " is: "); 
            System.out.println(result); 

        } else if (c == 3){
            int result = a*b;
            System.out.println("The product of " + a + " and " + b + " is: "); 
            System.out.println(result); 

        }else if (c == 4){
if(a ==0){
                    System.out.println("The quotient of " + a + " and " + b + " is: 0");
}else{
            if(a%b == 0){
                int result = a/b;

                System.out.print("The quotient of " + a + " and " + b + " is: "); 
                System.out.println(result); 
            }if(a/b == 0)
            {
                System.out.println("The quotient of " + a + " and " + b + " is: " + a + " /" + b); 
            }    if(a%b != 0 && a/b != 0){
                int result = a/b;
                int remainder = a%b;

                System.out.println("The quotient of " + a + " and " + b + " is: " + result + " " + remainder + "/" + b); 
            }}
            //  double x = a;
            //  double y = b;
            //     double result = x / y;

            // 	System.out.print("The quotient of " + a + " and " + b + " is: "); 
            // 	System.out.println(result); 

            //	         result = x % y;

            // 	System.out.print("The integer division of " + a + " divided by " + b + " is: " + a/b + " and the remainder is " ); 
            // 	System.out.println(result); 

        }else if (c == 5){
            double x = a;
            double y = b;
            double result = x % y;

            System.out.print("The remainder of " + a + " divided by " + b + " is: "); 
            System.out.println(result); 

        }
        else {
            System.out.println("Please enter a valid operation!"); 
        }

        System.out.println("Would you like to calculate something else? Press 1 for yes, press any number for no");
        int d = reader.nextInt();
        if (d ==1){
            calculator();
        }else
        {
            System.out.println("The end.");
        }}
}