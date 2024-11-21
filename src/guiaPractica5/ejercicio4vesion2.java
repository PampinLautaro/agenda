package guiaPractica5;

import java.util.Scanner;

public class ejercicio4vesion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el número de DNI: ");
		int dni = scanner.nextInt();
	        
		System.out.print("Introduce la letra del DNI (mayúscula): ");
		char letra = scanner.next().charAt(0);
		
		if (dni < 0 || dni > 99999999) {
			System.out.println("número de DNI inválido");
		} 
		
		char letraDNI = calcularLetraDNI(dni);
		
		if (letra == letraDNI) {
			System.out.println("La letra del DNI es: " + letraDNI + " y los datos son correctos");
		} else {
			System.out.println("las letras no coinciden, tu letra fue: " + letra + " y la correcta es: " + letraDNI);
		}
	}
	
	public static char calcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23; // este resto no esta bien
        System.out.println("resto = " + resto);
        return letras.charAt(resto);
    }
}
