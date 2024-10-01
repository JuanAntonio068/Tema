package parte2;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "milimetros"
		double milimetros;
		// Declaramos la variable "centimetros"
		double centimetros;
		// Declaramos la variable "metros"
		double metros;
		// Declaramos la variable "milimetrosFinal"
		double milimetrosFinal;
		// Declaramos la variable "metrosFinal"
		double metrosFinal;
		// Declaramos la variable "summa"
		double suma;
		// Preguntamos al usuario la primera medida en milímetros
		System.out.println("Dime una medida en milímetros");
		// En la variable "milimetros" se guarda el valor establecido
		milimetros = sc.nextDouble();
		// Preguntamos al usuario la segunda medida en centímetros
		System.out.println("Dime una medida en centímetros");
		// En la variable "centimetros" se guarda el valor establecido
		centimetros = sc.nextDouble();
		// Preguntamos al usuario la tercera medida en metros
		System.out.println("Dime una medida en metros");
		// En la variable "metros" se guarda el valor establecido
		metros = sc.nextDouble();
		// En la variable "milimetrosFinal" se pasan y se guardan los milímetros dados a
		// centímetros
		milimetrosFinal = milimetros / 10;
		// En la variable "metrosFinal" se pasan y se guardan los metros dados a
		// centimetros
		metrosFinal = metros * 100;
		// En la variable "suma" se suman las variables y se guarda el resultado
		suma = centimetros + milimetrosFinal + metrosFinal;
		// Imprimimos el resultado
		System.out.println("La suma de las tres medidas es: " + suma + " centímetros");
		// Cerramos el escaner
		sc.close();
	}

}
