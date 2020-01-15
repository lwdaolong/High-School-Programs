
import java.util.*;
public class ps06
{
    
    
       public static void main (String args[]) {
        calculator();

    } 
    


    public static void calculator(){
        Scanner reader = new Scanner (System.in); 

        System.out.println("Enter an operation: 1 = part 1, 2 = part 2, 3 = part 3, 4 = part 4, 5 = part 5");
        int c = reader.nextInt();
        int highestnumber= 0;
        int b;

        // use conditionals to determine which operation to use and to correctly calculate result
        // if c is 1, then use addition, etc.
        if (c ==1){
            System.out.println("Enter an integer that you would like to count up to: ");
            int a = reader.nextInt(); 
            for(int i =1; i<=a; i++){
                System.out.println(i);
            }
        }
        else if (c==2){
            System.out.println("Enter an integer that you would like to count up to: ");
            int a = reader.nextInt(); 
            for(int i =1; i<a; i++){
                System.out.print(i + ", ");
            }
            System.out.println(a);
        }

     else if (c == 3){
            System.out.println("Here are positive multiples of 4 from 1 to 100 "); 
            for(int i =0; i<=100; i+= 4){
                System.out.println(i);
            }
         
    }else if (c ==4){
            System.out.println("Enter an integer that you would like to list factors of: ");
            int a = reader.nextInt(); 
            for(int i =1; i<=a; i++){
                if(a%i == 0){
                    System.out.println(i);
                }
            }
        
        }else if (c ==5){
            
                     do{
                System.out.println("Enter integers and the highest magnitude will be outputted (0 to end)");
                int a = reader.nextInt();
                b=a;
                if(b>highestnumber){
                    highestnumber = b;
                }
                

            }while(b!=0);
            
            System.out.println( highestnumber + " is the highest number you entered");
            
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
