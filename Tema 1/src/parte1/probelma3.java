package parte1;

import java.util.Scanner;

public class probelma3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int actual;
		
		int nacimiento;
		
		int edad;
		
		System.out.println("Dime el año acutal");
		
		actual= sc.nextInt();
		
		System.out.println("Dime tu año de nacimiento");
		
		nacimiento= sc.nextInt();
		
		edad= actual - nacimiento;
		
		System.out.println("Tu edad es: " + edad);

		sc.close();
	}

}
