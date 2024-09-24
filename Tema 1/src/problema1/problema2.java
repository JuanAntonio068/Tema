package problema1;

import java.util.Scanner;

public class problema2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		
		int edad;
		
		edad = sc.nextInt();
		
		int edadProximo = edad + 1;
		
		System.out.println("El próximo año tendras " + edadProximo);
		

		sc.close();

	}

}
