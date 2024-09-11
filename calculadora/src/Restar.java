public class Restar extends Operacion {
    public Restar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public void operar() {
        System.out.println("La resta es: " + (numero1 - numero2));
    }
}
