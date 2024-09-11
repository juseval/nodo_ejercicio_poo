public class Multiplicar extends Operacion {
    public Multiplicar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public void operar() {
        System.out.println("La multiplicación es: " + (numero1 * numero2));
    }
}
