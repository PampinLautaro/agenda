package guiaPractica3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) { // mal hecho (ver consigna)
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("elija un numero impar para terminar la iteracion");
		double numero = scanner.nextInt();
		double i = 3;
		double numeroPi = 0;
		for (; i <= numero; i+=2) {
			System.out.println("4 - 4/" + i);
			numeroPi = (4) + (4/i);
		}
		System.out.println(numeroPi);
	}

}
