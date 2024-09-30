package parte1;

import java.util.Scanner;

public class probelma03 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "actual"
		int actual;
		// Declaramos la variable "nacimiento"
		int nacimiento;
		// Declaramos la variable "edad"
		int edad;
		// Le preguntamos al usuario que nos diga el año actual
		System.out.println("Dime el año acutal");
		// En la variable "actual" se guarda el valor establecido
		actual = sc.nextInt();
		// Le preguntamos al usuario que nos diga su año de nacimiento
		System.out.println("Dime tu año de nacimiento");
		// En la variable "nacimiento" se guarda el valor establecido
		nacimiento = sc.nextInt();
		// En la variable "edad" se guarda el valor de la resta entre las variables
		// "actual" y "nacimiento"
		edad = actual - nacimiento;
		// Imprimmos el resultado
		System.out.println("Tu edad es: " + edad);
		// Cerramos el escaner
		sc.close();

	}

}
