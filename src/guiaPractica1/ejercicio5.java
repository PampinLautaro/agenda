package guiaPractica1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese la longitud del primer cateto = ");
		double cateto1 = scanner.nextDouble();
		
		System.out.println("ingrese la longitud del segundo cateto = ");
		double cateto2 = scanner.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("la hipotenusa es = " + hipotenusa);
	}
}
