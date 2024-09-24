package problema1;

import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la primera nota");
		
		Double primeraNota = sc.nextDouble();
		
		System.out.println("Dime la segunda nota");
		
		Double segundaNota = sc.nextDouble();
		
		Double media = (primeraNota + segundaNota) / 2;
		
		System.out.println("La media artimetica de tus notas es: " + media);

		sc.close();
	}

}
