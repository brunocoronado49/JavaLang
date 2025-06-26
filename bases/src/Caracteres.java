public class Caracteres {
    public static void main(String[] args) {
        char myChar = 'B';
        System.out.println("myChar = " + myChar);

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(caracter == decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println(simbolo == caracter);

        char espacio = '#';
        System.out.println("espacio = " + espacio);
        System.out.println("Type char is equals in byte to: " + Character.BYTES);
        System.out.println("Type char is equals in bites to: " + Character.SIZE);
        System.out.println("Mix value of char: " + Character.MAX_VALUE);
        System.out.println("Min value of char: " + Character.MIN_VALUE);
    }
}
