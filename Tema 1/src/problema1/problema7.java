package problema1;

import java.util.Scanner;

public class problema7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime su nombre, dirección y teléfono");
		
		String nombre = sc.nextLine();
		
		String direccion = sc.nextLine();
		
		int telefono = sc.nextInt();
		
		System.out.println("Nombre: " + nombre);
		
		System.out.println("Dirección: " + direccion);
		
		System.out.println("Teléfono: " + telefono);

		sc.close();
	}

}
