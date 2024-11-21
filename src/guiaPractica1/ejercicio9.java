package guiaPractica1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese la distancia recorrida en km: ");
		double distancia = scanner.nextInt();
		
		System.out.println("ingrese el tiempo en horas: ");
		double tiempo = scanner.nextInt();
		
		double velocidad = (distancia/tiempo);
		
		// para hacerlo de solo 2 decimales
		BigDecimal bd = new BigDecimal(velocidad);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
				
		System.out.println("su velocidad media fue de: " + bd + "KM/H");
	}
}
