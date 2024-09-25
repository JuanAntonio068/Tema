package parte1;

import java.util.Scanner;

public class problema05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		Double radio;
		//Declaramos la variable "radio"
		Double longitud;
		//Declaramos la variable "longitud"
		Double area;
		//Declaramos la variable "area"
		System.out.println("Introduce el radio de la circunferencia");
		//Preguntamos al usuario que nos diga el radio de la circuferencia
		radio= sc.nextDouble();
		//En la variable "radio" se guarda el valor establecido
		longitud= (2 * Math.PI) * radio;
		//En la variable "longitud" se guarda el valor tras hacer la fórumula de la longitud de una circuferencia
		area= Math.PI * (radio * radio);
		//En la variable "area" se guarda el valor tras hacer la fórumla del área de una circunferencia
		System.out.println("La longitud de la circuferencia es: " + longitud + " y el área de la circunferencia es: " + area);
		//Imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
