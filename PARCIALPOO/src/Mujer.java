public class Mujer extends Persona {
    public Mujer(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }

    @Override
    public double calcularTMB() {
        return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
    }
}