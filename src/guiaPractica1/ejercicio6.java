package guiaPractica1;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) { // COMO SE HACE ESTO?!?!?! 
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("El número ingresado no es de cuatro dígitos.");
            return;
        }

        int digito1 = numero / 1000;
        int digito2 = (numero % 1000) / 100;
        int digito3 = (numero % 100) / 10;
        int digito4 = numero % 10;

        int numeroReverso = digito4 * 1000 + digito3 * 100 + digito2 * 10 + digito1;

        System.out.println("El número escrito en reverso es: " + numeroReverso);
        
	}

}
