package parte1;

import java.util.Scanner;

public class problema8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		int edad;
		
		System.out.println("Dime tu nombre y tu edad");
		
		nombre= sc.nextLine();
		
		edad= sc.nextInt();
		
		System.out.println("Hola " + nombre + " , tienes " + edad + " años, ¡qué mayor eres!");

		sc.close();

	}
}
