package guiaPractica3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserte un numero entero positivo: ");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			for (int i = 1; i <= numero; i++) {
				System.out.println("i = " + i);
			}
		} else {
			System.out.println("error, no inserto un numero entero positivo");
		}
	}
}
