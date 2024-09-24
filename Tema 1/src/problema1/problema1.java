package problema1;

import java.util.Scanner;

public class problema1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Short numero;
		
		System.out.println("Escribe un número");

		numero = sc.nextShort();
		
		System.out.println("Ha escrito: " + numero);

		sc.close();

	}

}
