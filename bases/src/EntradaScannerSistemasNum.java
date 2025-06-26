import java.util.Scanner;

public class EntradaScannerSistemasNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String name = sc.next();

        System.out.println("Ingresa tu edad:");
        int age = sc.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
