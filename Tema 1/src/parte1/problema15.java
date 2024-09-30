package parte1;

import java.util.Scanner;

public class problema15 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "precio"
		double precio;
		// Declaramos la variable "precioFinal"
		double precioFinal;
		// Declaramos la constante "IVA"
		final double IVA = 0.21;
		// Preguntamos al usuaior el precio del producto
		System.out.println("Dime el precio del producto que quieres comprar");
		// En la variable "precio" se guarda el valor establecido
		precio = sc.nextDouble();
		// En la variable "precioFinal" se calcula y guarda el precio con el IVA
		// incluido
		precioFinal = precio + IVA * precio;
		// Imprimimos el resultado
		System.out.println("El precio con el Iva icluido es de: " + precioFinal);
		// Cerramos el escaner
		sc.close();
	}

}
