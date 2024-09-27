package parte1;

import java.util.Scanner;

public class problema05 {

	public static void main(String[] args) {
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos la variable "radio"
		Double radio;
		//Declaramos la variable "longitud"
		Double longitud;
		//Declaramos la variable "area"
		Double area;
		//Preguntamos al usuario que nos diga el radio de la circuferencia
		System.out.println("Introduce el radio de la circunferencia");
		//En la variable "radio" se guarda el valor establecido
		radio= sc.nextDouble();
		//En la variable "longitud" se guarda el valor tras hacer la fórumula de la longitud de una circuferencia
		longitud= (2 * Math.PI) * radio;
		//En la variable "area" se guarda el valor tras hacer la fórumla del área de una circunferencia
		area= Math.PI * (radio * radio);
		//Imprimimos el resultado
		System.out.println("La longitud de la circuferencia es: " + longitud + " y el área de la circunferencia es: " + area);
		//Cerramos el escaner
		sc.close();
		
	}

}
