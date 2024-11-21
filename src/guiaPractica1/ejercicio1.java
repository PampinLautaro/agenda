package guiaPractica1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese el numero de horas trabajadas: ");
		int horasTrabajadas = scanner.nextInt();
		
		System.out.println("ingrese la paga x hora: ");
		int costePorHora = scanner.nextInt();
		
		int pagaTotal = horasTrabajadas * costePorHora;
		
		System.out.println("la paga total por semana es: " + pagaTotal);
		
		scanner.close();
	}

}
