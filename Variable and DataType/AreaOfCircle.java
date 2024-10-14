// Area of circle = 3.14*r*r

import java.util.*;
// import java.lang.Math;          we can also use math fuction to print area of circle

public class AreaOfCircle{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();                   // Radius should be float cause it can be in decimal 
        float area = 3.14f*r*r;                  // As 3.14 is a float value so we have to take datatype as float.
        // float area = 3.14f*Math.pow(r,2);             Using math function 
        System.out.print(area);
        sc.close();

    }
}
