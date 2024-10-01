
// Practice question 1: In a program,input 3 numbers:A, B and C.You have to out put the average of these 3 numbers.

import java.util.*;

public class PQ1_AverageOfThreeNumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();                   // User input of number
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println(sum);


        // Avg of three number
        int avg = sum/3;
        System.out.println(avg);
        sc.close();
    }
    
}
