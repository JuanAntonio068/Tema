package parte1;

import java.util.Scanner;

public class problema7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		String direccion;
		
		int telefono;
		
		System.out.println("Dime su nombre, dirección y teléfono");
		
		nombre= sc.nextLine();
		
		direccion= sc.nextLine();
		
		telefono= sc.nextInt();
		
		System.out.println("Nombre: " + nombre);
		
		System.out.println("Dirección: " + direccion);
		
		System.out.println("Teléfono: " + telefono);

		sc.close();
	}

}
