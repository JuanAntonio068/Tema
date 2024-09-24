package problema1;

import java.util.Scanner;

public class problema5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia");
		
		Double radio = sc.nextDouble();
		
		Double longitud = (2 * Math.PI) * radio;
		
		Double area = Math.PI * (radio * radio);
		
		System.out.println("La longitud de la circuferencia es: " + longitud + " y el área de la circunferencia es: " + area);
	
		sc.close();

	}

}
