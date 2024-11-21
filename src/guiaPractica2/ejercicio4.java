package guiaPractica2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese su peso en kilogramos: ");
		double peso = scanner.nextDouble();
		
		System.out.println("ingrese su altura en metros: ");
		double altura = scanner.nextDouble();
		
		double altura2 = altura * altura;
		
		double IMC = (peso/altura2);
		
		BigDecimal bd = new BigDecimal(IMC);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		
		if(IMC < 16) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("criterio de ingreso");
		} if(IMC > 16 && IMC < 16.9) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("infrapeso");
		} if(IMC > 17 && IMC < 18.4) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("bajo peso");
		} if(IMC > 18.5 && IMC < 24.9) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("peso normal");
		} if(IMC > 25 && IMC < 29.9) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("sobrepeso");
		} if(IMC > 30 && IMC < 34.9) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("obesidad premorbida");
		} if(IMC > 35 && IMC < 45) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("obesidad morbida");
		} if(IMC > 45) {
			System.out.println("el IMC es = " + IMC);
			System.out.println("obesidad hipermorbida");
		} 
	}

}
