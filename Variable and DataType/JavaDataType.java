//Understanding Primitive Data Types in Java

public class JavaDataType{
    public static void main(String arg[]){

        // 1 byte = 8 bits
        //byte DataType: Stores whole numbers from -128 to 127 | 8 bits/1 bytes size
        byte a = 12;
        System.out.println(a);

        //char DataType: Stores a single character/letter or ASCII values | 16 bits/2 bytes size
        char b = 'z';
        System.out.println(b);

        //boolean DataType: Stores true or false values | 8 bits/1 bytes size
        boolean c = false;
        System.out.println(c);
        
        //float DataType: Stores fractional numbers (Decimal values) | Sufficient for storing 6 to 7 decimal digits | Always put f at the end of the value | eg. 1.23e100f, 10.2f | 32 bits/4 bytes size
        float price = 10.5f;
        System.out.println(price);

        //double DataType: Stores fractional numbers. Sufficient for storing 15 decimal digits | Always put d at the end of the value | 64 bits/8 bytes size
        double d = 10.33333333d;
        System.out.println(d);

        //int DataType: Stores whole numbers from -2,147,483,648 to 2,147,483,647 | 32 bits/4 bytes size
        int number = 234;
        System.out.println(number);

        //long DataType: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Always put l at the end of the value | 64 bits/8 bytes size
        long l = 9292929299292292l;
        System.out.print(l);

        //short DataType: Stores whole numbers from -32,768 to 32,767 | 16 bits/2 bytes size
        short sh = 7171;
        System.out.println(sh);

    }
}