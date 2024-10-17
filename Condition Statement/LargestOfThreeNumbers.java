
// CalculatingLargest of three numbers


import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if ( a >= b && a >= c){                                                       // check if a is greater than b and c or not if this statement is not true that means A is smaller than either one of them or both of them in both case a is not the greatest
            System.out.println("The largest of three number is: " + " " + a);
        }
        else if ( b>= c){                                                             // This statement will only be checked if the if statement is wrong, if A is not the greatest then either b is greatest or c.
            System.out.println("The largest of three number is: " + " " + b);
        }
        else{                                                                         // If according to upper else if statement b is not the greatest then c is greatest. 
            System.out.println("The largest of three number is: " + " " + c);
        }

        sc.close();




    }
    
}
