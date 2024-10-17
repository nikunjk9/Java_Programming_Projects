// Income Tac Calculator: Using elseif statement conditions


import java.util.*;

public class IncomeTaxCalculator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();                                // Taking input of income from user
        int tax;                                                  // Automatically the value of this is 0

        if (income < 500000){                                     // Checking the condition the if the income is less than 5 lakh
            tax = 0;
    
        }
        else if (income >= 500000 && 1000000 >= income){          // Checking the condition the if the income is greater than 5 lakh and also less than 10 lakh
            tax = (int) (income*0.2);                             // TypeCasting: as we are converting int value into float/double
        }

        else {
            tax = (int) (income*0.3);                             // TypeCasting: as we are converting int value into float/double
        }
        
        System.out.println("Your tax amount is:" + " " + tax);

        

    }
}