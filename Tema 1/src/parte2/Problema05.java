package parte2;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "segundos"
		int segundos;
		// Declaramo sla variable "minutos"
		int minutos;
		// Declaramos la variable "horas"
		int horas;
		// Declaramos la variable "segundoFinal"
		int segundoFinal;
		// Preguntamos al usuario los segundos que quiere introducir
		System.out.println("Introduce los segundos que deseas");
		// En la variable "segundos" se guarda el valor establecido
		segundos = sc.nextInt();
		// Calculamos los minutos finales y el valor se guarda en la variable "minutos"
		minutos = (segundos % 3600) / 60;
		// Calculamos las horas finales y el valor se guarda en la variable "horas"
		horas = segundos / 3600;
		// Calculamos los segundos finales y el valor se guarda en la variable
		// "segundoFinal"
		segundoFinal = segundos % 60;
		// Imprimimos el resultado
		System.out.println(horas + " horas, " + minutos + " minutos, " + segundoFinal + " segundos");
		// Cerramos el escaner
		sc.close();
	}

}
