public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 200;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("binario de numeroDecimal = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("octal de numeroDecimal = " + Integer.toOctalString(numeroDecimal));
        System.out.println("hexadecimal de numeroDecimal = " + Integer.toHexString(numeroDecimal));
    }
}
