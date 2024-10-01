package parte1;

import java.util.Scanner;

public class Problema08 {
	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "nombre"
		String nombre;
		// Declaramos la variable "edad"
		int edad;
		// Preguntamos al usuario su nombre y edad
		System.out.println("Dime tu nombre y tu edad");
		// En la variable "nombre" se guarda el primer valor establecido
		nombre = sc.nextLine();
		// En la variable "edad" se guarda el segundo valor establecido
		edad = sc.nextInt();
		// Imprimimos el resultado
		System.out.println("Hola " + nombre + " , tienes " + edad + " años, ¡qué mayor eres!");
		// Cerramos el escaner
		sc.close();

	}
}
