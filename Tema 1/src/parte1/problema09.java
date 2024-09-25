package parte1;

import java.util.Scanner;

public class problema09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		int edad;
		//Declaramos la variable "edad"
		boolean mayoria;
		//Declaramos la variable "mayoria"
		System.out.println("Dime tu edad");
		//Preguntamos al usuairo su edad"
		edad = sc.nextInt();
		//En la variable edad se guarda el valor establecido
		mayoria = edad >= 18;
		//En la variable "mayoria" se guuarda una comparacion
		System.out.println(mayoria);
		//Imprimios el resultado
		sc.close();
		//Cerramos el escaner
	}

}
