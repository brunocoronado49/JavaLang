public class TypeConvertion {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        int numeroDecimal = 34;
        String numeroDecimalStr = Integer.toString(numeroDecimal);
        String numeroDecimalStr2 = String.valueOf(numeroDecimal);
        System.out.println("numeroDecimalStr = " + numeroDecimalStr);
        System.out.println("numeroDecimalStr2 = " + numeroDecimalStr2);
        
        String numeroDouble = "34.8";
        double numeroDoubleStr = Double.parseDouble(numeroDouble);
        System.out.println("numeroDoubleStr = " + numeroDoubleStr);

        String isBooleanString = "True";
        boolean isBoolean = Boolean.parseBoolean(isBooleanString);
        System.out.println("isBoolean = " + isBoolean);

        int i = 10;
        short s = (short)i;
        long l = i;
        System.out.println("l = " + l);
        System.out.println("s = " + s);
    }
}
