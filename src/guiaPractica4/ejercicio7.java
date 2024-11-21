package guiaPractica4;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Ingrese un número (0 para salir): ");
	            numero = scanner.nextInt();

	            if (numero != 0) {
	                System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
	            }
	        } while (numero != 0);

	        scanner.close();
	}
	public static int sumaDigitos(int numero) {
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
