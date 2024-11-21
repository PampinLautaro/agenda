package guiaPractica5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Química");
        asignaturas.add("Historia");
        asignaturas.add("Lenguaje");

        double[] notas = new double[asignaturas.size()];

        System.out.println("Ingrese las notas para cada asignatura:");
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.print(asignaturas.get(i) + ": ");
            notas[i] = scanner.nextDouble();
        }

        List<String> asignaturasRepetir = new ArrayList<>();
        for (int i = 0; i < asignaturas.size(); i++) {
            if (notas[i] < 7) { 
                asignaturasRepetir.add(asignaturas.get(i));
            }
        }

        System.out.println("\nAsignaturas que debe repetir:");
        if (asignaturasRepetir.isEmpty()) {
            System.out.println("No hay asignaturas que repetir.");
        } else {
            for (int i = 0; i < asignaturasRepetir.size(); i++) {
            	  String asignatura = asignaturasRepetir.get(i);
            	  System.out.println(asignatura);
            	}
        }

        scanner.close();
	}

}
