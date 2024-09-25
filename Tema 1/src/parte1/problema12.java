package parte1;

import java.util.Scanner;

public class problema12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Declaramos el escaner
		float peras;
		//Declaramos la variable "peras"
		float manzanas;
		//Decalaramos la variable "manzanas"
		float total;
		//Declaramos la variable "total"
		final float PRECIOMAN= 2.35f;
		//Declaramos la constante "PRECIOMAN", que será el precio de cada kilo de manzanas
		final float PRECIOPER= 1.95f;
		//Declaramos la constante "PRECIOPER", que será el precio de cada kilo de peras
		System.out.println("¿Cuantos kilos de peras quieres?");
		//Le preguntamos al usuario cuantos kilos de peras quiere
		peras=sc.nextFloat();
		//En la variable "pera" se guarda el valor introducido
		System.out.println("¿Cuantos kilos de manzanas quieres?");
		//Le preguntamos al usuario cuantos kilos de manzanas quiere
		manzanas=sc.nextFloat();
		//En la variable "manzana" se guarda el valor introducido
		total=(peras*PRECIOPER)+(manzanas*PRECIOMAN);
		//En la variable total calculamos y guardamos el precio total 
		System.out.println("El importe total es: " + total);
		//Imprimimos el resultado en la consola
		sc.close();
		//Cerramos el escaner
	}

}
