package parte1;

import java.util.Scanner;

public class problema13{ 
	

	    public static void main(String[] args) {
	    	//Declaramos el escaner
	        Scanner sc= new Scanner(System.in);
	        //Declaramos la variable "llueve"
	        boolean llueve;
	        //Declaramos la variable "tareas"
	        boolean tareas;
	        //Declaramos "Biblio"
	        boolean Biblio;
	        //Declaramos la variable "permisoSalir"
	        boolean permisoSalir;
	        //Preguntamos al usuario si esta lloviendo
	        System.out.print("¿Está lloviendo? (true/false): ");
	        //En la variable "llueve" se guarda el valor establecido
	        llueve= sc.nextBoolean();
	        //Preguntamos al usuario si ha finalizado sus tareas
	        System.out.print("¿Has finalizado tus tareas? (true/false): ");
	        //En la variable "tareas" se guarda el valor establecido
	        tareas= sc.nextBoolean();
	        //Preguntamos al usuario si necesita ir a la biblioteca
	        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
	        //En la varianle "Biblio"
	        Biblio= sc.nextBoolean();
	        // En la variable "permisoSalir" se determina por operadores lógicos si puede salir
	        permisoSalir= Biblio || (!llueve && tareas);
	        //Imprimimos el resultado
	        System.out.println("Permiso para salir: " + permisoSalir);
	        //Cerramos el escaner
	        sc.close();
	    }

}
