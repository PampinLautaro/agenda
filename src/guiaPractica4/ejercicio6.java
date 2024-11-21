package guiaPractica4;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        int numeroMayorSumatoria = 0;
        int sumatoriaMayor = 0;
        int contadorMenor10 = 0;

        System.out.println("Ingrese números positivos (ingrese 0 para terminar):");

        int numero = scanner.nextInt();

        while (numero != 0) {
            int sumatoria = sumaDigitos(numero);
            if (sumatoria > sumatoriaMayor) {
                sumatoriaMayor = sumatoria;
                numeroMayorSumatoria = numero;
            }
            if (sumatoria < 10) {
                contadorMenor10++;
            }
            numero = scanner.nextInt();
        }

        System.out.println("El número con la mayor sumatoria de dígitos es: " + numeroMayorSumatoria);
        System.out.println("Cantidad de números con sumatoria de dígitos menor que 10: " + contadorMenor10);
	}
	
	public static int sumaDigitos(int numero) {
        int sumatoria = 0;
        while (numero != 0) {
            sumatoria += numero % 10;
            numero /= 10;
        }
        return sumatoria;
    }
}
