package parte2;

import java.util.Scanner;

public class problema03 {

	public static void main(String[] args) {
		// Declaramos el escaner
				Scanner sc = new Scanner(System.in);
				// Declaramos la variable "num"
				int num1;
				
				int num2;
				// Declaramos la variable "falta"
				int falta;
				// Preguntamos al usuario que nos diga un número
				System.out.println("Dime dos números");
				// En la variable "num" se guarda el valor establecido
				num1 = sc.nextInt();
				
				num2 = sc.nextInt();
				// En la variable "falta" se calcula y se guarda lo que le falta al número para ser múltiplo del "num2"
				falta = (num2 - num1 % num2) % num2;
				// Imprimimos el resultado
				System.out.println((num1 % num2 == 0) ? num1 + " ya es múltiplo de " + num2
						: "Hace falta sumarle " + falta + " para que " + num1 + " sea múltiplo de " + num2);
				// Cerramos el escaner
				sc.close();
	}

}
