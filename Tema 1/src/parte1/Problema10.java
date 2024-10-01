package parte1;

import java.util.Scanner;

public class Problema10 {
	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "numero"
		int numero;
		// Declaramos la variable "p"
		int p;
		// Declaramos la variable "par"
		boolean par;
		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		// En la variable "numero" se guarda el valor establecido
		numero = sc.nextInt();
		// En la valiable "p" se guarda el valor del modulo entre la variable "numero" y
		// 2
		p = numero % 2;
		// Se hace la comparación de si la variable "p" es igual a 0 y se guarda el
		// valor en la variable "par"
		par = p == 0;
		// Imprimimos el resultado
		System.out.println(par);
		// Cerramos el escaner
		sc.close();

	}
}