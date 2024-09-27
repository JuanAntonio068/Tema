package parte1;

import java.util.Scanner;

public class problema04 {

	public static void main(String[] args) {
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos la variable primeraNota
		Double primeraNota;
		//Declaramos la variable segundaNota
		Double segundaNota;
		//Preguntamos al usuario que nos diga su primera nota
		System.out.println("Dime la primera nota");
		//En la variable primeraNota se guarda el valor establecido
		primeraNota= sc.nextDouble();
		//Preguntamos al usuario que nos diga su segunda nota
		System.out.println("Dime la segunda nota");
		//En la variable primeraNota se guarda el valor establecido
		segundaNota= sc.nextDouble();
		//Hacemos la media de las dos variables e imprimos el resultado
		System.out.println("La media artimetica de tus notas es: " + (primeraNota + segundaNota)/2);
		//Cerramos el escaner
		sc.close();
		
	}

}
