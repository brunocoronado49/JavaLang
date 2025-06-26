import javax.swing.*;

public class VentanaDialogoSistemasNum {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(
                null,
                "Ingresa un numero entero"
        );

        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje = "El numero es: " + numeroDecimal;
        mensaje += "\t Y en numero binario es: " + Integer.toBinaryString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
