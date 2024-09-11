public class Dividir extends Operacion {
    public Dividir(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public void operar() {
        if (numero2 != 0) {
            System.out.println("La división es: " + (numero1 / numero2));
        } else {
            System.out.println("Error: División por cero.");
        }
    }
}
