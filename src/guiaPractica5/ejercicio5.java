package guiaPractica5;

import java.util.Random;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumFrecuencia = new int[11];
		
		Random random = new Random();
		
		for (int i = 0; i < 36000; i++) {
			int dado1 = random.nextInt()+1;
			int dado2 = random.nextInt()+1;
			
			int suma = dado1 + dado2;
			
			sumFrecuencia[suma - 2]++;
			System.out.println("sumFrecuencia = " + sumFrecuencia);
		}
		System.out.println("Sum\tFrequency");
        for (int i = 0; i < sumFrecuencia.length; i++) {
            System.out.println((i + 2) + "\t" + sumFrecuencia[i]); 
        }
	}
}
