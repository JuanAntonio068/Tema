package parte1;

import java.util.Scanner;

public class problema09 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "edad"
		int edad;
		// Declaramos la variable "mayoria"
		boolean mayoria;
		// Preguntamos al usuairo su edad"
		System.out.println("Dime tu edad");
		// En la variable edad se guarda el valor establecido
		edad = sc.nextInt();
		// En la variable "mayoria" se guuarda una comparacion
		mayoria = edad >= 18;
		// Imprimios el resultado
		System.out.println(mayoria);
		// Cerramos el escaner
		sc.close();

	}

}
