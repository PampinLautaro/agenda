package guiaPractica2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese numero de mes del año: ");
		int numeroMes = scanner.nextInt();
		
		if (numeroMes >= 1 && numeroMes <= 12) {
			if(numeroMes == 1) {
				System.out.println("enero");
			} if(numeroMes == 2) {
				System.out.println("febrero");
			} if(numeroMes == 3) {
				System.out.println("marzo");
			} if(numeroMes == 4) {
				System.out.println("abril");
			} if(numeroMes == 5) {
				System.out.println("mayo");
			} if(numeroMes == 6) {
				System.out.println("junio");
			} if(numeroMes == 7) {
				System.out.println("julio");
			} if(numeroMes == 8) {
				System.out.println("agosto");
			} if(numeroMes == 9) {
				System.out.println("septiembre");
			} if(numeroMes == 10) {
				System.out.println("octubre");
			} if(numeroMes == 11) {
				System.out.println("noviembre");
			} if(numeroMes == 12) {
				System.out.println("diciembre");
			}
		} else {
			System.out.println("este numero no tiene mes");
		}
	}
}
