//Input in Java


//Importing package containing classes in java 
import java.util.*;

public class InputInJava{
    public static void main(String arg[]){

        // Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);           // Scanner : Already existing class in java
        String input = sc.next();                      // .next() : Used to capture any word but it only captures word upto the line break (space)
        System.out.print(input);

        String name = sc.nextLine();                 // .nextLine() : used to get the input from the user, It can read the input till the end of line
        System.out.print(name);

        // For taking int value as input
        int number = sc.nextInt();                   // .nextInt() : returns the int value of the number
        System.out.print(number);                    

        // For taking float value as input
        float decimal = sc.nextFloat();              // .nextFloat() : returns the float value (10.3. 2.9)
        System.out.print(decimal);

        // For taking double value as input
        double double_number = sc.nextDouble();             // .nextDouble() : returns the double value (10.38888, 2.9234566)
        System.out.print(double_number);

        // For taking boolean value as input
        boolean y = sc.nextBoolean();                // .nextBoolean() : returns the boolean value (True, False)
        System.out.print(y);

        // For taking short value as input
        short short_number = sc.nextShort();                // .nextShort() : returns whole numbers from -32,768 to 32,767
        System.out.print(short_number);

        // For taking long value as input
        long long_number = sc.nextLong();                  // .nextLong() : returns whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.print(long_number);

        // For taking byte value as input
        byte byte_number = sc.nextByte();                   // .nextByte() : returns whole numbers from -128 to 127
        System.out.print(byte_number);

        sc.close();                           // Closing the scanner










    }
}