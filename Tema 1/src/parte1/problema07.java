package parte1;

import java.util.Scanner;

public class problema07 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "nombre"
		String nombre;
		// Declaramos la variable "direccion"
		String direccion;
		// Declaramos la variable "telefono"
		int telefono;
		// Preguntamos al usuario su nombre, dirección y teléfono
		System.out.println("Dime su nombre, dirección y teléfono");
		// En la variable "nombre" se guarda el primer valor establecido
		nombre = sc.nextLine();
		// En la variable "direccion" se guarda el segundo valor establecido
		direccion = sc.nextLine();
		// En la variable "telefono" se guarda el tercer valor establecido
		telefono = sc.nextInt();
		// Imprimimos el resultado
		System.out.println("Nombre: " + nombre);
		// Imprimimos el resultado
		System.out.println("Dirección: " + direccion);
		// Imprimimos el resultado
		System.out.println("Teléfono: " + telefono);
		// Cerramos el escaner
		sc.close();

	}

}
