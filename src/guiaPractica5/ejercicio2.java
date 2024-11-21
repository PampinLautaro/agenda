package guiaPractica5;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Ingrese una palabra en minusculas sin espacios: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo");
        }
	}
	public static boolean esPalindromo(String palabra) {
        return new StringBuilder(palabra).reverse().toString().equals(palabra); // se usa StringBuilder porque se pueden usar estas funciones de .reverse/.equals y despues convertirlo a .tostring
    }
}
