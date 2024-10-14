// Type conversion in Java

import java.util.*;

public class TypeConversion{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // Typer conversion from int to long is possible
        int a =20;
        long b = a;
        System.out.print(b);

        //Type conversion from long to int is not possible cause the size of long in java is bigger than int
        // So, connversion from large size datatype to small size datatype is not possible
        long r = 20;
        int s = r;
        System.out.print(s);            // Error: lossy conversion from long to int


        // Now let's try with user input
        // int to float conversion is possible
        float p = sc.nextInt();                   // this shows that we are taking integer value as input and storing it into float variable
        System.out.print(p);


        // Float to int conversion is not possible
        int z = sc.nextFloat();                    // Error: Cannot convert float to int
        System.out.print(z);

        sc.close();

        


    } 
}