package guiaPractica1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Obtener los coeficientes de la ecuación
        System.out.print("Ingresa el valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Validar si la ecuación tiene soluciones reales
        if (discriminante >= 0) {
            // Calcular las soluciones
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Imprimir las soluciones
            System.out.println("Las soluciones de la ecuación son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
	}

}
