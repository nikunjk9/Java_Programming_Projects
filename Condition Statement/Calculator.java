
/*  Create a calculator
    1. +
    2. -
    3. /
    4. %
    5. *
*/

import java.util.*;

public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("What is the value of a: " );                               // Asking user to enter a
        int a = sc.nextInt();                                                          // Taking input of a 
         
        System.out.println("What is the value of b:" );                                // Asking user to enter b
        int b = sc.nextInt();                                                          // Taking input of a
        
        System.out.println("What is the value of operator:");                           // Asking user to enter operator
        char operator = sc.next().charAt(0);                                            // Taking input of operator
        

        switch (operator){
            case '+' : System.out.println(a+b);                                         
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Wrong Operator or number!! Try again");
                        break;
        }

        sc.close();

    }
    
}
