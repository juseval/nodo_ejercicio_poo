public class Sumar extends Operacion {
    public Sumar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public void operar() {
        System.out.println("La suma es: " + (numero1 + numero2));
    }
}
