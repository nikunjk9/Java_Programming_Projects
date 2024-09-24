
// Parameter of Rectangle = 2*(l + b)

import java.util.*;

public class ParameterOfRectangle{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = l + b;
        System.out.println(sum);

        float parameter = 2*sum;
        System.out.print(parameter);
        sc.close();
    }
}