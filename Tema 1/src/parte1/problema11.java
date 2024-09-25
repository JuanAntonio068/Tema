package parte1;

import java.util.Scanner;

public class problema11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declaramos el escaner
		float peseta;
		// Declaramos la variable "peseta"
		float euro;
		// Declaramos la variable "euro"
		System.out.println("Dime el número de pesetas");
		// Preguntamos al usario el número de pesetas que desea convertir a euro
		peseta = sc.nextFloat();
		// En la variable "peseta" se guarda el valor introducido
		euro = peseta / 166;
		// En la variable "euro" se pasa el valor introducido a euros
		System.out.println("Equivale a " + euro + " euros");
		// Imprimimos el resultado en la consola
		sc.close();
		// Cerramos el escaner
	}

}
