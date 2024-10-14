
// Using Scanner class for creating object to input values
// Sum of two number

import java.util.*;

public class Sumoftwonumber2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();                        // Taking values as input
        int b = sc.nextInt();
        int sum = a + b;                             // Performing calculation
        System.out.print(sum);
        sc.close();
    }
}