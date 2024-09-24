package problema1;

import java.util.Scanner;

public class problema6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos números");
		
		int numero1 = sc.nextInt();
		
		int numero2 = sc.nextInt();
		
		int suma = numero1 + numero2;
		
		int resta = numero1 - numero2;
		
		int mult = numero1 * numero2;
		
		int div = numero1 / numero2;
		
		System.out.println("La suma de ambos números es: " + suma);
		
		System.out.println("La resta de ambos números es: " + resta);
		
		System.out.println("La multiplicación de ambos númneros es: " + mult);
		
		System.out.println("La división de ambos números es: " + div);

		sc.close();
	}

}
