package parte1;

import java.util.Scanner;

public class problema02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		int edad;
		//Declaramos la variable "edad"
		System.out.println("Dime tu edad");
		//Preguntamos al usuario su edad
		edad = sc.nextInt();
		//En la variable "edad" se guarda el valor establecido
		System.out.println("El próximo año tendras " + ++edad);
		//Aumentamos la variable "edad" en 1 e imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
