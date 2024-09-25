package parte1;

import java.util.Scanner;

public class problema07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		String nombre;
		//Declaramos la variable "nombre"
		String direccion;
		//Declaramos la variable "direccion"
		int telefono;
		//Declaramos la variable "telefono"
		System.out.println("Dime su nombre, dirección y teléfono");
		//Preguntamos al usuario su nombre, dirección y teléfono
		nombre= sc.nextLine();
		//En la variable "nombre" se guarda el primer valor establecido
		direccion= sc.nextLine();
		//En la variable "direccion" se guarda el segundo valor establecido
		telefono= sc.nextInt();
		//En la variable "telefono" se guarda el tercer valor establecido
		System.out.println("Nombre: " + nombre);
		//Imprimimos el resultado
		System.out.println("Dirección: " + direccion);
		//Imprimimos el resultado
		System.out.println("Teléfono: " + telefono);
		//Imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
