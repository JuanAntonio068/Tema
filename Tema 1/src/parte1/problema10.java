package parte1;

import java.util.Scanner;

public class problema10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		int numero;
		//Declaramos la variable "numero"
		int p;
		//Declaramos la variable "p"
		boolean par;
		//Declaramos la variable "par"
		System.out.println("Dime un número");
		//Preguntamos al usuario por un número
		numero= sc.nextInt();
		//En la variable "numero" se guarda el valor establecido
		p=numero%2;
		//En la valiable "p" se guarda el valor del modulo entre la variable "numero" y 2
		par=p==0;
		//Se hace la comparación de si la variable "p" es igual a 0 y se guarda el valor en la variable "par"
		System.out.println(par);
		//Imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}
}