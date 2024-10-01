package parte1;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "peras"
		float peras;
		// Decalaramos la variable "manzanas"
		float manzanas;
		// Declaramos la variable "total"
		float total;
		// Declaramos la constante "PRECIOMAN", que será el precio de cada kilo de
		// manzanas
		final float PRECIOMAN = 2.35f;
		// Declaramos la constante "PRECIOPER", que será el precio de cada kilo de peras
		final float PRECIOPER = 1.95f;
		// Le preguntamos al usuario cuantos kilos de peras quiere
		System.out.println("¿Cuantos kilos de peras quieres?");
		// En la variable "pera" se guarda el valor introducido
		peras = sc.nextFloat();
		// Le preguntamos al usuario cuantos kilos de manzanas quiere
		System.out.println("¿Cuantos kilos de manzanas quieres?");
		// En la variable "manzana" se guarda el valor introducido
		manzanas = sc.nextFloat();
		// En la variable total calculamos y guardamos el precio total
		total = (peras * PRECIOPER) + (manzanas * PRECIOMAN);
		// Imprimimos el resultado en la consola
		System.out.println("El importe total es: " + total);
		// Cerramos el escaner
		sc.close();

	}

}
