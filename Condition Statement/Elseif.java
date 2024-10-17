
// Understanding else if condition statements

import java.util.*;

public class Elseif {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();                                        // Taking age from user input

        if (age >= 18){                                                // Condition that the age should be greater than equals to 18
            System.out.println("Adult: Eligible to vote and drive");   // if condition meets(True) then print this
        }

        // We can write multiple if statements
        else if (age > 13 && 18 > age){                                     // if the (if statement) is tru then this condition will not be checked || Check if the age is greater than 13 and less than 18
            System.out.println("Teenager");
        }

        else {                                       // Check if the age is greater than 1 and less than 8
            System.out.println("Child");
        }
        sc.close();
    }
}
