package guiaPractica2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero para ver si es capicua: ");
		String numero = scanner.next();
		
		if(esCapicua(numero) == true) {
			System.out.println("es capicua");
		} else {
			System.out.println("no es capicua");
		}
	}

	public static boolean esCapicua(String numero) {
		  String numeroStr = String.valueOf(numero);

		  String numeroStrInvertido = new StringBuilder(numeroStr).reverse().toString();

		  return numeroStr.equals(numeroStrInvertido);
		}
	
}
