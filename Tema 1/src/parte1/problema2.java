package parte1;

import java.util.Scanner;

public class problema2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
		
		int edadProximo;
		
		System.out.println("Dime tu edad");
		
		edad = sc.nextInt();
		
		edadProximo= edad + 1;
		
		System.out.println("El próximo año tendras " + edadProximo);
		

		sc.close();

	}

}
