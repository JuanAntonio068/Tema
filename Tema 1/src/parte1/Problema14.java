package parte1;

import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "primeraNota"
		int primeraNota;
		// Declaramos la variable "segundaNota"
		int segundaNota;
		// Declaramos la variable "terceraNota"
		int terceraNota;
		// Declaramos la variable "expediente"
		double expediente;
		// Preguntamos al usuario su primera, segunda y tercera nota
		System.out.println("Dime tus notas del primer, segundo y tercer trimestre");
		// En la variable "primeraNota" se guarda el primer valor establecido
		primeraNota = sc.nextInt();
		// En la variable "segundaNota" se guarda el segundo valor establecido
		segundaNota = sc.nextInt();
		// En la variable "terceraNota" se guarda el tercer valor establecido
		terceraNota = sc.nextInt();
		// En la variable "expediente" calcula y se transforma en double la media de las
		// tres notas
		expediente = (double) (primeraNota + segundaNota + terceraNota) / 3;
		// Imprimimos la media de las tres notas sin decimales
		System.out.println("Tu nota en el boletín es:" + (primeraNota + segundaNota + terceraNota) / 3);
		// Imprimimos el resultado
		System.out.println("Tu nota en el expediente es:" + expediente);
		// Cerramos el escaner
		sc.close();
	}

}
