package parte2;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "a"
		int a;
		// Declaramos la varaible "b"
		int b;
		// Declaramos la variable "c"
		int c;
		// Declaramos la variable "x"
		int x;
		// Declaramos la variable "y"
		int y;
		// Preguntamos al usuario el valor de a
		System.out.println("Dime el valor de a");
		// En la variable "a" se guarda el valor establecido
		a = sc.nextInt();
		// Preguntamos al usuario el valor de b
		System.out.println("Dime el valor de b");
		// En la variable "b" se guarda el valor establecido
		b = sc.nextInt();
		// Preguntamos al usuario el valor de c
		System.out.println("Dime el valor de c");
		// En la variable "c" se guarda el valor establecido
		c = sc.nextInt();
		// Preguntamos al usuario el valor de x
		System.out.println("Dime el valor de x");
		// En la variable "x" se guarda el valor establecido
		x = sc.nextInt();
		// En la variable "y" se calcula y se guarda el resultado de la función
		y = a * (x * x) + b + c;
		// Imprimimos el resultado
		System.out.println("y vale " + y);
		// Cerramos el escaner
		sc.close();
	}

}
