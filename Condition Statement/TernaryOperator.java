
// Ternary Operator

import java.util.*;

public class TernaryOperator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();                                      // Taking input from user

        //Ternary Operator to check if number is Odd or Even
        String type = ((number)%2 == 0) ? "Even" : "Odd";               // 
        System.out.println("The type of number is:" + " " + type);
    }
    
}
