package guiaPractica4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("seleccione un mes: ");
		int numeroMes = scanner.nextInt() - 1;
		
        int diasMes = 30; // años de 360 dias

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("mes no valido");
        }
        
        int diasPasados = numeroMes * diasMes;
        
        System.out.println("Días pasados desde el inicio del año hasta el 1er día es de " + diasPasados);
        
	}
	
}
