package problema1;

import java.util.Scanner;

public class problema8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre y tu edad");
		
		String nombre = sc.nextLine();
		
		int edad = sc.nextInt();
		
		System.out.println("Hola " + nombre + " , tienes " + edad + " años, ¡qué mayor eres!");

		sc.close();

	}
}
