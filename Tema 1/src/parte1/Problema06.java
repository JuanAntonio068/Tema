package parte1;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "numero1"
		int numero1;
		// Declaramos la variable "numero2"
		int numero2;
		// Declaramos la variable "resta"
		int resta;
		// Declaramos la variable "suma"
		int suma;
		// Preguntamos al usuario dos numeros
		System.out.println("Dime dos números");
		// En la variable "numero1" se guarda el primer valor establecido
		numero1 = sc.nextInt();
		// En la variable "numero2" se guarda el segundo valor establecido
		numero2 = sc.nextInt();
		// En la variable "resta" se guarda el valor de la resta de ambas variables
		resta = numero1 - numero2;
		// En la variable suma se guarda el valor de la suma de ambas variables
		suma = numero1 + numero2;
		// Se hace la suma de ambas variables e imprimimos el resultado
		System.out.println("La suma de ambos números es: " + suma);
		// Imprimimos el resultado
		System.out.println("La resta de ambos números es: " + resta);
		// Se hace la multiplicacion de ambas variables e imprimimos el resultado
		System.out.println("La multiplicación de ambos númneros es: " + numero1 * numero2);
		// Se hace la división de ambas variables e imprimimos el resultado
		System.out.println("La división de ambos números es: " + numero1 / numero2);
		// Cerramos el escaner
		sc.close();

	}

}
