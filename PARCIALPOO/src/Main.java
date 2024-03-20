
public class Main {
    public static void main(String[] args) {
 
        Persona hombre = new Hombre(70, 175, 30);
        Persona mujer = new Mujer(60, 160, 25);
        
        System.out.println("TMB para el hombre: " + hombre.calcularTMB());
        System.out.println("TMB para la mujer: " + mujer.calcularTMB());
    }
}