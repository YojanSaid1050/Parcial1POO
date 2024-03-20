import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos para el cálculo de la TMB para un hombre:");
        System.out.print("Peso en kilogramos: ");
        double pesoHombre = scanner.nextDouble();
        System.out.print("Altura en centímetros: ");
        double alturaHombre = scanner.nextDouble();
        System.out.print("Edad en años: ");
        int edadHombre = scanner.nextInt();

        System.out.println("Ingrese los datos para el cálculo de la TMB para una mujer:");
        System.out.print("Peso en kilogramos: ");
        double pesoMujer = scanner.nextDouble();
        System.out.print("Altura en centímetros: ");
        double alturaMujer = scanner.nextDouble();
        System.out.print("Edad en años: ");
        int edadMujer = scanner.nextInt();

        Persona hombre = new Hombre(pesoHombre, alturaHombre, edadHombre);
        Persona mujer = new Mujer(pesoMujer, alturaMujer, edadMujer);

        double tmbHombre = hombre.calcularTMB();
        double tmbMujer = mujer.calcularTMB();

        System.out.println("TMB para el hombre: " + tmbHombre);
        System.out.println("TMB para la mujer: " + tmbMujer);

        scanner.close();
    }
}