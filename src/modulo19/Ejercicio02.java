package modulo19;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		int resultado = 0;
		
		System.out.println("Ingresar n°1: ");
		numero1 = teclado.nextInt();
		System.out.println("Ingresar n°2: ");
		numero2 = teclado.nextInt();

		int numero1Absoluto = Math.abs(numero1);
		int numero2Absoluto = Math.abs(numero2);
		if (!(numero1 == 0) && !(numero2 == 0)) {
			for (int i = 0; i < numero2Absoluto; i++)
				resultado += numero1Absoluto;
		}
		if ((numero1>=0 && numero2>=0) || (!(numero1>=0) && !(numero2>=0))) {
			System.out.println(numero1+" x "+ numero2 + " : "+ resultado);
		} else {
			System.out.println(numero1+" x "+ numero2 + " : -"+ resultado);
		}
		
		
		teclado.close();
	}

}
