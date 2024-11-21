package guiaPractica2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserte su edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("inserte su ingreso mensual en usd: ");
		int ingreso = scanner.nextInt();
		
		if(edad > 16 && ingreso > 500) {
			System.out.println("tenes que tributar");
		} else {
			System.out.println("no tenes que tributar");
		}
	}
}
