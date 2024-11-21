package guiaPractica2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserte un numerador: ");
		double numerador = scanner.nextInt();
		
		System.out.println("inserte un denominado: ");
		double denominado = scanner.nextInt();
		
		if(denominado != 0) {
			double fraccion = (numerador / denominado);
			System.out.println(numerador + "/" + denominado);
			System.out.println("y el resultado es: " + fraccion);
		} else {
			System.out.println("error, denominador 0");
		}
	}

}
