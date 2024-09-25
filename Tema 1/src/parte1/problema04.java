package parte1;

import java.util.Scanner;

public class problema04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declaramos el escaner
		Double primeraNota;
		//Declaramos la variable primeraNota
		Double segundaNota;
		//Declaramos la variable segundaNota
		System.out.println("Dime la primera nota");
		//Preguntamos al usuario que nos diga su primera nota
		primeraNota= sc.nextDouble();
		//En la variable primeraNota se guarda el valor establecido
		System.out.println("Dime la segunda nota");
		//Preguntamos al usuario que nos diga su segunda nota
		segundaNota= sc.nextDouble();
		//En la variable primeraNota se guarda el valor establecido
		System.out.println("La media artimetica de tus notas es: " + (primeraNota + segundaNota)/2);
        //Hacemos la media de las dos variables e imprimos el resultado
		sc.close();
		//Cerramos el escaner
	}

}
