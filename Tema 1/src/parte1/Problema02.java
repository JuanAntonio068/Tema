package parte1;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "edad"
		int edad;
		// Preguntamos al usuario su edad
		System.out.println("Dime tu edad");
		// En la variable "edad" se guarda el valor establecido
		edad = sc.nextInt();
		// Aumentamos la variable "edad" en 1 e imprimimos el resultado
		System.out.println("El próximo año tendras " + ++edad);
		// Cerramos el escaner
		sc.close();

	}

}
