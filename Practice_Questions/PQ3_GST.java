
/*  Practice question 3: Enter cost of 3 items from the user (using float datatype)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.*;

public class PQ3_GST{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();             // Pencil
        float b = sc.nextFloat();             // Pen
        float c = sc.nextFloat();             // Eraser
        float sum = a+b+c;
        float gst = sum + (sum*18/100);        // Also can write as (sum*0.18f)

        System.out.println("Sum of items: " + sum);
        System.out.print("Total sum after GST: " + gst);
        sc.close();

    }
}