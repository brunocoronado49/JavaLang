public class Primitivos {
    static float varFlotante; // Variable de la class

    public static void main(String[] args) {
        byte byteNumber = 127;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("Type byte is equals in byte to: " + Byte.BYTES);
        System.out.println("Type byte is equals in bites to: " + Byte.SIZE);
        System.out.println("Mix value of byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of byte: " + Byte.MIN_VALUE);

        System.out.println("==========================================");

        short shortNumber = 3000;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("Type short is equals in byte to: " + Short.BYTES);
        System.out.println("Type short is equals in bites to: " + Short.SIZE);
        System.out.println("Mix value of short: " + Short.MAX_VALUE);
        System.out.println("Min value of short: " + Short.MIN_VALUE);

        System.out.println("==========================================");

        int intNumber = 344;
        System.out.println("intNumber = " + intNumber);
        System.out.println("Type int is equals in byte to: " + Integer.BYTES);
        System.out.println("Type int is equals in bites to: " + Integer.SIZE);
        System.out.println("Mix value of int: " + Integer.MAX_VALUE);
        System.out.println("Min value of int: " + Integer.MIN_VALUE);

        System.out.println("==========================================");

        long longNumber = 3343L;
        System.out.println("longNumber = " + longNumber);
        System.out.println("Type long is equals in byte to: " + Long.BYTES);
        System.out.println("Type long is equals in bites to: " + Long.SIZE);
        System.out.println("Mix value of long: " + Long.MAX_VALUE);
        System.out.println("Min value of long: " + Long.MIN_VALUE);

        System.out.println("==========================================");

        float floatNumber = 34.1f;
        // float realFloat = 0.00000000015f; // 1.5E-10
        System.out.println("floatNumber = " + floatNumber);
        System.out.println("Type float is equals in byte to: " + Float.BYTES);
        System.out.println("Type float is equals in bites to: " + Float.SIZE);
        System.out.println("Mix value of float: " + Float.MAX_VALUE);
        System.out.println("Min value of float: " + Float.MIN_VALUE);

        System.out.println("==========================================");

        double doubleNumber = 34.3;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("Type double is equals in byte to: " + Double.BYTES);
        System.out.println("Type double is equals in bites to: " + Double.SIZE);
        System.out.println("Mix value of double: " + Double.MAX_VALUE);
        System.out.println("Min value of double: " + Double.MIN_VALUE);

        System.out.println("==========================================");

        System.out.println("varFlotante: " + varFlotante);
    }
}
