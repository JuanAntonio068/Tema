package parte1;

import java.util.Scanner;

public class problema06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		int numero1;
		//Declaramos la variable "numero1"
		int numero2;
		//Declaramos la variable "numero2"
		int resta;
		//Declaramos la variable "numero3"
		System.out.println("Dime dos números");
		//Preguntamos al usuario dos numeros
		numero1 = sc.nextInt();
		//En la variable "numero1" se guarda el primer valor establecido
		numero2= sc.nextInt();
		//En la variable "numero2" se guarda el segundo valor establecido
		resta= numero1 - numero2;
		//En la variable "resta" se guarda el valor de la resta de ambas variables	
		System.out.println("La suma de ambos números es: " + numero1+numero2);
		//Se hace la suma de ambas variables e imprimimos el resultado
		System.out.println("La resta de ambos números es: " + resta);
		//Imprimimos el resultado
		System.out.println("La multiplicación de ambos númneros es: " + numero1*numero2);
		//Se hace la multiplicacion de ambas variables e imprimimos el resultado
		System.out.println("La división de ambos números es: " + numero1/numero2);
		//Se hace la división de ambas variables e imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
