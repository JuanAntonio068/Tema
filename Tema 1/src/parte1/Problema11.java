package parte1;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "peseta"
		float peseta;
		// Declaramos la variable "euro"
		float euro;
		// Preguntamos al usario el número de pesetas que desea convertir a euro
		System.out.println("Dime el número de pesetas");
		// En la variable "peseta" se guarda el valor introducido
		peseta = sc.nextFloat();
		// En la variable "euro" se pasa el valor introducido a euros
		euro = peseta / 166;
		// Imprimimos el resultado en la consola
		System.out.println("Equivale a " + euro + " euros");
		// Cerramos el escaner
		sc.close();

	}

}
