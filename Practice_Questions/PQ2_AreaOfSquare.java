
// Practice question 2: In a program,input the side of a square.You have to output the area of the square

import java.util.*;

public class PQ2_AreaOfSquare{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        float s = sc.nextFloat();
        float area = s*s;

        // Another way to print output
        System.out.print("area of Square :" + area);
        sc.close();

    }
}