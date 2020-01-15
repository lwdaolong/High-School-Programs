
import java.util.*;
public class Calcps05
{
    public static void main (String args[]) {
        calculator();

    } 

    public static void calculator(){
        Scanner reader = new Scanner (System.in); 
        // System.out.print("Enter an integer: ");
        // int a = reader.nextInt(); 
        //  System.out.print("Enter an integer: ");
        // int b = reader.nextInt();
        double result = 1;
        double sum = 0;
        double count= 0;
        double b;
        boolean prime = true;

        System.out.println("Enter an operation: 1 = factorial, 2 = average, 3 = prime");
        int c = reader.nextInt();

        // use conditionals to determine which operation to use and to correctly calculate result
        // if c is 1, then use addition, etc.
        if (c ==1){
            System.out.println("Enter an integer that you would like to factorial: ");
            int a = reader.nextInt(); 
            for(int i =1; i <= a; i++){
                result= result * i;
            }
            System.out.print("factorial of " + a + " is: "); 
            System.out.println(result); 

        } else if (c == 2){
            do{
                System.out.println("Enter integers that you would like to average (0 to end)");
                int a = reader.nextInt();
                b=a;
             sum = sum+ b;
             count ++;
            }while(b!=0);
              
        count = count - 1;

        result = sum/ count;
        System.out.println("The total sum of your integers: " + sum); 
        System.out.println("The total number of inputs you entered: " + count); 
        System.out.println("The average is: " + result); 

    } else if (c == 3){

         do{
                System.out.println("Enter integers that you would like to check if prime (0 to end)");
                int a = reader.nextInt();
                b=a;
                for( int i= 2; i<(b-1); i++)
                {
                  if (b%i== 0){
                          prime = false;
                    }
                }
                if(prime == false){
                System.out.println(b + " is not a prime number"); 
                prime =true;
                }else{
                System.out.println(b + " is a prime number"); 
                prime = true;
                }

            }while(b!=0);
             
            
           
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
