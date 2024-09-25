package parte1;

import java.util.Scanner;

public class probelma03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		int actual;
		//Declaramos la variable "actual"
		int nacimiento;
		//Declaramos la variable "nacimiento"
		int edad;
		//Declaramos la variable "edad"
		System.out.println("Dime el año acutal");
		//Le preguntamos al usuario que nos diga el año actual
		actual= sc.nextInt();
		//En la variable "actual" se guarda el valor establecido
		System.out.println("Dime tu año de nacimiento");
		//Le preguntamos al usuario que nos diga su año de nacimiento
		nacimiento= sc.nextInt();
		//En la variable "nacimiento" se guarda el valor establecido
		edad= actual - nacimiento;
		//En la variable "edad" se guarda el valor de la resta entre las variables "actual" y "nacimiento"
		System.out.println("Tu edad es: " + edad);
		//Imprimmos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
