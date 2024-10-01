package parte2;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num"
		int num;
		// Declaramos la variable "falta"
		int falta;
		// Preguntamos al usuario que nos diga un número
		System.out.println("Dime un número");
		// En la variable "num" se guarda el valor establecido
		num = sc.nextInt();
		// En la variable "falta" se calcula y se guarda lo que le falta al número para
		// ser múltiplo de 7
		falta = (7 - num % 7) % 7;
		// Imprimimos el resultado
		System.out.println((num % 7 == 0) ? num + " ya es múltiplo de 7"
				: "Hace falta sumarle " + falta + " para que " + num + " sea múltiplo de 7");
		// Cerramos el escaner
		sc.close();
	}

}
