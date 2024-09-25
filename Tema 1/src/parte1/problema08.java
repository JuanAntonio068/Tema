package parte1;

import java.util.Scanner;

public class problema08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		String nombre;
		//Declaramos la variable "nombre"
		int edad;
		//Declaramos la variable "edad"
		System.out.println("Dime tu nombre y tu edad");
		//Preguntamos al usuario su nombre y edad
		nombre= sc.nextLine();
		//En la variable "nombre" se guarda el primer valor establecido
		edad= sc.nextInt();
		//En la variable "edad" se guarda el segundo valor establecido
		System.out.println("Hola " + nombre + " , tienes " + edad + " años, ¡qué mayor eres!");
		//Imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}
}
