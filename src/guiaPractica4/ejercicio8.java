package guiaPractica4;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaTotal = 0; 
        int sumaDigitosInd = 0;
        int sumaDigitosTotal = 0;

        System.out.println("Ingrese números (ingrese 0 para finalizar):");

        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                sumaTotal = sumaTotal + numero;
                sumaDigitosInd = sumaDigitosInd + sumaDigitos(numero);
                System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
            }
        } while (numero != 0);
        
        sumaDigitosTotal = sumaDigitos(sumaTotal);

        System.out.println("La suma de todos los números ingresados es: " + sumaTotal + ", y su suma es: " + sumaDigitosTotal);
        System.out.println("La suma de todos los dígitos de los números ingresados es: " + sumaDigitosInd);
        
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
