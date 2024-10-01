package parte2;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "metros"
		double metros;
		// Declaramos la variable "centimetros"
		double centimetros;
		// Preguntamos al usuario que nos diga la longitud en metros
		System.out.println("¿Cuál ha sido la longitud del lanzamiento (en metros)?");
		// En la variable "metros" se guarda el valor establecido
		metros = sc.nextDouble();
		// En la variable "centimetros" se pasan los metros a centimetros, se trunca,
		// dejando solo la parte la entera y se gaurda le resultado
		centimetros = (int) (metros * 100);
		// Imprimimos el resultado
		System.out.println("Se han contado " + centimetros + " centímetros");
		// Cerramos el escaner
		sc.close();
	}

}
