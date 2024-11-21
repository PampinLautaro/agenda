package guiaPractica4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero k: ");
        int k = scanner.nextInt();

        System.out.print("Ingrese la cantidad de dígitos n: ");
        int n = scanner.nextInt();
        
        String kString = String.valueOf(k);
        
        String primerosDigitos = kString.substring(0, n);

        System.out.println("Los " + k + " dígitos más a la izquierda de " + n + " son: " + primerosDigitos);
	}

}
