package problema1;

import java.util.Scanner;

public class problema10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		int p;
		
		boolean par;
		
		System.out.println("Dime un número");
		
		numero= sc.nextInt();
		
		p=numero%2;
		
		
		par=p==0;
		
		
		System.out.println(par);
		
		sc.close();
		
	}
}