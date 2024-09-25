package parte1;

import java.util.Scanner;

public class problema6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero1;
		
		int numero2;
		
		int resta;
		
		System.out.println("Dime dos números");
		
		
		numero1 = sc.nextInt();
		
		numero2= sc.nextInt();
		
		resta= numero1 - numero2;
		
		
		System.out.println("La suma de ambos números es: " + numero1+numero2);
		
		System.out.println("La resta de ambos números es: " + resta);
	
		System.out.println("La multiplicación de ambos númneros es: " + numero1*numero2);
		
		System.out.println("La división de ambos números es: " + numero1/numero2);

		sc.close();
	}

}
