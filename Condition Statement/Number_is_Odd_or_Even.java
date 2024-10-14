
// Checking if the number is Odd or Even


import java.util.*;

public class Number_is_Odd_or_Even {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

        if ( a%2 == 0){                                               // Check is the modulo (Remainder of two number) is qual to 0 or not.
            System.out.println("------------------");
            System.out.println("Number is Even");                     // if it is 0 then Number is Even.
        }
        else{
            System.out.println("Number is Odd");                      // If it is not 0 then Number is Odd.
        }

        sc.close();
    }
    
}
