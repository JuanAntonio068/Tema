package parte1;

import java.util.Scanner;

public class problema01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		Short numero;
		//Declaramos la variable "numero"
		System.out.println("Escribe un número");
		//Preguntamos al usuario que es escriba un número
		numero = sc.nextShort();
		//En la variable "numero" se guarda el valor introducido
		System.out.println("Ha escrito: " + numero);
		//Imprimimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
