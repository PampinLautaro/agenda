package guiaPractica1;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int m = scanner.nextInt();

        int cociente = n / m;
        int resto = n % m;

        System.out.println(n + " entre " + m + " da un cociente de " + cociente + " y un resto de " + resto);
	}

}
