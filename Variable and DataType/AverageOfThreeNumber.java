

import java.util.Scanner;

public class AverageOfThreeNumber {
   public AverageOfThreeNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var5 = var2 + var3 + var4;
      System.out.println(var5);
      int var6 = var5 / 2;
      System.out.println(var6);
      var1.close();
   }
}
