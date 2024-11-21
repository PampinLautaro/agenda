package guiaPractica5;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de DNI: ");
        int dni = scanner.nextInt();
        
        System.out.print("Introduce el numero de letra del DNI (DNI/23): ");
        int letra = scanner.nextInt();
        
        if(dni < 0 && dni > 99999999) {
	        System.out.println("numero de dni invalido");
        } else {
        	char letraIngresada = calcularLetraDNI(letra);
        	char letraDNI = calcularLetraDNI(dni);
        	
        	if(letraIngresada == letraDNI) {
        		System.out.println("La letra del DNI es: " + letraDNI + " y los datos son correctos");
        	} else {
        		System.out.println("las letras no coinciden, tu letra fue: " + letraIngresada + " y la correcta es: " + letraDNI);
        	}
        }
	}
	
	public static char calcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        System.out.println("resto = " + resto);
        return letras.charAt(resto);
    }
}
