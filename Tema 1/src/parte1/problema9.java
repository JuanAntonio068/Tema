package parte1;

import java.util.Scanner;

public class problema9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int edad;
		
		boolean mayoria;
		
		System.out.println("Dime tu edad");
		
		edad = sc.nextInt();

		mayoria = edad >= 18;
		
		System.out.println(mayoria);

		sc.close();
	}

}
