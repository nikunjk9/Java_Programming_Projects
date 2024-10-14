
// Parameter of Rectangle = 2*(l + b)

import java.util.*;

public class PerimeterOfRectangle{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float perimeter = 2*(l + b);
        System.out.print(perimeter);
        sc.close();
    }
}
