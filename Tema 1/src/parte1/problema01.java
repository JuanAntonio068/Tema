package parte1;

import java.util.Scanner;

public class problema01 {

	public static void main(String[] args) {
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos la variable "numero"
		Short numero;
		//Preguntamos al usuario que es escriba un número
		System.out.println("Escribe un número");
		//En la variable "numero" se guarda el valor introducido
		numero = sc.nextShort();
		//Imprimimos el resultado
		System.out.println("Ha escrito: " + numero);
		//Cerramos el escaner
		sc.close();
		
	}

}
