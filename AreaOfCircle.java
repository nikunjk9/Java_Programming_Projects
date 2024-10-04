// Area of circle = 3.14*r*r

import java.util.*;
import java.lang.Math;

public class AreaOfCircle{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();                   // Radius should be float cause it can be in decimal 
        float area = 3.14f*Math.pow(r,2);                  // As 3.14 is a float value so we have to take datatype as float.
        System.out.print(area);
        sc.close();

    }
}
