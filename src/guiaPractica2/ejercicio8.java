package guiaPractica2;

import java.util.Calendar;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar ahora = Calendar.getInstance();

		int horas = ahora.get(Calendar.HOUR_OF_DAY);
		int minutos = ahora.get(Calendar.MINUTE);
		int segundos = ahora.get(Calendar.SECOND);

		int segundosTranscurridos = (horas * 3600) + (minutos * 60) + segundos;

		System.out.println("la hora actual es: " + horas + ":" + minutos + ":" + segundos);
		System.out.println("segundos transcurridos: " + segundosTranscurridos);
	}
}