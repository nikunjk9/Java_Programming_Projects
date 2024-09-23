// Product of two numbers

import java.util.*;

public class ProductOfTwoNumbers{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.print(product);
        sc.close();
    }
}