package parte2;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num"
		double num;
		// Declaramos la variable "redondeo"
		int redondeo;
		// Preguntamos al usuario un número
		System.out.println("Dime el número que quieras redondear");
		// En la variable "num" se guarda el valor establecido
		num = sc.nextDouble();
		// En la variable "redondeo" se hace y guarda el redondeo del numero establecido
		redondeo = (int) (num + 0.5);
		// Imprimimos el resultado
		System.out.println("El número redondeado es: " + redondeo);
		// Cerramos el escaner
		sc.close();
	}

}