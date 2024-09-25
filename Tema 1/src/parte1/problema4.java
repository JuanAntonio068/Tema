package parte1;

import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double primeraNota;
		
		Double segundaNota;
		
		System.out.println("Dime la primera nota");
		
		primeraNota= sc.nextDouble();
		
		System.out.println("Dime la segunda nota");
		
		segundaNota= sc.nextDouble();
		
		System.out.println("La media artimetica de tus notas es: " + (primeraNota + segundaNota)/2);

		sc.close();
	}

}
