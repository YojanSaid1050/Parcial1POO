public class Hombre extends Persona {
    
	public Hombre(double peso, double altura, int edad) {
        super(peso, altura, edad);
        }
@Override
public double calcularTMB() {
    return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
}
}