package parte2;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "entradasNinyos"
		int entradasNinyos;
		// Declaramos la variable "entradasAdultos"
		int entradasAdultos;
		// Declaramos la variable "total"
		double total;
		// Declaramos la variable "totalFinal"
		double totalFinal;
		// Declaramos la constante "DESCUENTO"
		final double DESCUENTO = 0.05;
		// Declaramos la constante "INFANTIL"
		final double INFANTIL = 15.50;
		// Declaramos la constante "ADULTO
		final double ADULTO = 20;
		// Preguntamos al usuario cuantas entradas de adulto quiere
		System.out.println("¿Cuántas entradas de adulto quiere?");
		// En la variable "entradasAdultos" se guarda el valor establecido
		entradasAdultos = sc.nextInt();
		// Preguntamos al usuario cuantas entradas de niño quiere
		System.out.println("¿Cuántas entradas de niños quiere?");
		// En la variable "entradasNinyos" se guarda el valor establecido
		entradasNinyos = sc.nextInt();
		// En la variable "total" se calcula el precio total de las entradas y se guarda
		// el resultado
		total = (entradasAdultos * ADULTO) + (entradasNinyos * INFANTIL);
		// En la variable "totalFinal" se calcula el descuento en el caso que el total
		// iguale o supere los 100 euros y se guarda el resultado
		totalFinal = total - (total * DESCUENTO);
		// Imprimimos el resultado
		System.out.println((total >= 100) ? "El total seria: " + totalFinal + " euros": "El total sería: " + total + " euros");
		// Cerramos el escaner
		sc.close();
	}

}
