package problema1;

import java.util.Scanner;

public class probelma3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el año acutal");
		
		int actual = sc.nextInt();
		
		System.out.println("Dime tu año de nacimiento");
		
		int nacimiento = sc.nextInt();
		
		int edad = actual - nacimiento;
		
		System.out.println("Tu edad es: " + edad);

		sc.close();
	}

}
