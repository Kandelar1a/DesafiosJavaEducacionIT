package modulo02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;

		System.out.print("Nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Apellido: ");
		apellido = teclado.nextLine();

		System.out.print("Primera letra en Mayuscula: ");
		String nombrePrimeraLetraMayuscula = nombre.substring(0, 1).toUpperCase() 
				+ nombre.substring(1).toLowerCase();
		System.out.println(nombrePrimeraLetraMayuscula);
		System.out.print("Primera letra en Mayuscula: ");
		String apellidoPrimeraLetraMayuscula = apellido.substring(0, 1).toUpperCase()
				+ apellido.substring(1).toLowerCase();
		System.out.println(apellidoPrimeraLetraMayuscula);
		
		teclado.close();
		
	}

}
