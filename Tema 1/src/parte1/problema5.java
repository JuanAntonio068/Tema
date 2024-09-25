package parte1;

import java.util.Scanner;

public class problema5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double radio;
		
		Double longitud;
		
		Double area;
		
		System.out.println("Introduce el radio de la circunferencia");
		
		radio= sc.nextDouble();
		
		longitud= (2 * Math.PI) * radio;
		
		area= Math.PI * (radio * radio);
		
		System.out.println("La longitud de la circuferencia es: " + longitud + " y el área de la circunferencia es: " + area);
	
		sc.close();

	}

}
