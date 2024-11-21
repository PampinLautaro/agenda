package guiaPractica1;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese numero de payasos: ");
		int numPayasos = scanner.nextInt();
		
		System.out.println("ingrese numero de muñecas: ");
		int numMuñecas = scanner.nextInt();
		
		int pesoPayasos = numPayasos * 112;
		int pesoMuñecas = numMuñecas * 75;
		
		int pesoTotal = pesoPayasos + pesoMuñecas;
		
		System.out.println("peso del paquete: " + pesoTotal);
	}
}
