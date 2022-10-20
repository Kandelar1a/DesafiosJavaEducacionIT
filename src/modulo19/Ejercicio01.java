package modulo19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		int[] numerosAleatorios;
		
		System.out.println("Indique la cantidad de números aleatorios a generar: ");
		cantidad = teclado.nextInt();
		numerosAleatorios = new int[cantidad];
		for (int i=0; i<numerosAleatorios.length; i++)
			numerosAleatorios[i] = (int) ((Math.random() * cantidad) +1);
			System.out.println(Arrays.toString(numerosAleatorios));

		
		for (int i = 0; i<numerosAleatorios.length; i++) {
			 
			if (numerosAleatorios[i] % 3 == 0 & numerosAleatorios[i] % 5 == 0)
				System.out.println("FizzBuzz");
				
			if (numerosAleatorios[i] % 3 == 0)
				 System.out.println("Fizz");
				
			if (numerosAleatorios[i] % 5 == 0) 
				System.out.println("Buzz");
			
			else System.out.println(numerosAleatorios[i]);
		}		
		
		teclado.close();
	}

}
