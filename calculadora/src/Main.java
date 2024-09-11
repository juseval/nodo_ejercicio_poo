import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources para cerrar el Scanner automáticamente

            System.out.println("Introduce el primer número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Introduce el segundo número:");
            double numero2 = scanner.nextDouble();

            System.out.println("Selecciona una operación: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
            int opcion = scanner.nextInt();

            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Sumar(numero1, numero2);
                    break;
                case 2:
                    operacion = new Restar(numero1, numero2);
                    break;
                case 3:
                    operacion = new Multiplicar(numero1, numero2);
                    break;
                case 4:
                    operacion = new Dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }

            operacion.operar();

        } // El Scanner se cierra automáticamente aquí
    }
}
