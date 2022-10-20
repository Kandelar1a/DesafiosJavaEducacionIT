package modulo02;

import java.util.Scanner;

public class Ejercicio02 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int cantidadDecimales;
		float base, exponente;
		double resultado;

		System.out.print("Numero base: ");
		base = teclado.nextFloat();

		System.out.print("Numero exponente: ");
		exponente = teclado.nextFloat();

		System.out.print("Cuantos decimales quiere mostrar: ");
		cantidadDecimales = teclado.nextInt();

		resultado = Math.pow(base, exponente);
		System.out.println(String.format(
				"La potencia con " + cantidadDecimales + " decimales: %." 
		         + cantidadDecimales + "f", resultado));
		
		teclado.close();
	}

}
