// Average of two number by user input

import java.util.*;

public class AverageOfThreeNumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();                   // User input of number
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println(sum);


        // Avg of three number
        int avg = sum/2;
        System.out.println(avg);
        sc.close();
    }
    
}
