
// Largest of two number
/*

   Different ways to add space in between to output in the same line
   1. \t
   2. " "

 */

import java.util.*;                                              //Importing scanner class

public class LargestOfTwoNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);                     // onject of scanner class
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){                                              // check if a is greater than b
            System.out.println("largest number is:"+ " " + a);        // if yess then print a
        }

        if ( a = b){                                               // we can also include this in first if statement like: (a >= b)
            System.out.println("Both numbers are equal");            
        }

        else{
            System.out.println("Largest number is: " + " " + b);         //if no then print b
        }

        sc.close();
    }
    
}
