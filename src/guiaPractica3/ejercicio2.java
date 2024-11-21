package guiaPractica3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserte un numero entero para ver si es primo: ");
		int numero = scanner.nextInt();
		
		if(esPrimo(numero) == true) {
			System.out.println(numero + " es primo ");
		} else {
			System.out.println(numero + " no es primo");
		}
	}

	public static boolean esPrimo(int numero) {
		if(numero <= 1) {
			return false; 
		} 
		for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
	}
}
