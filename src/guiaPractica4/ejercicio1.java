package guiaPractica4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserte diametro del circulo en cm: ");
		double diametro = scanner.nextDouble();
		
		double area = (3.141519) * diametro;
		System.out.println("area = " + area + "cm");
		
		System.out.println("inserte la altura en cm: ");
		double altura = scanner.nextDouble();
		
		double volumenCilindro = area * altura;
		
		System.out.println("volumenCilindro = " + volumenCilindro);
	}

}
