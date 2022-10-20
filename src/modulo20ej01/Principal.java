package modulo20ej01;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		String[] simbolos = { "*", ".", "-", "_" };
		final String dominioValido = "@educacionit.com";
		
		    System.out.print("Indique el correo electrónico del instituto: ");
		    String correo = teclado.nextLine().toLowerCase();
		    
	   do {
			if (correo.length() > dominioValido.length() && correo.endsWith(dominioValido)) {
				break;
			}
			if (correo.length() < dominioValido.length() && !(correo.endsWith(dominioValido))) {
				break;
			}
			
			System.out.println("Debe ser un correo valido y el dominio debe ser " + dominioValido);
		} while (true);
					
			
		    System.out.print("Indique la clave: ");
		   
		    String clave = teclado.nextLine();

			String primeraLetra = clave.substring(0, 1);
			boolean iniciaMayuscula = primeraLetra.toUpperCase().equals(primeraLetra);
			boolean contieneSimbolo = true;
		do {
			for (int i = 0; i < simbolos.length; i++) {
				if (clave.contains(simbolos[i])) {
					contieneSimbolo = false;
					break;
				}
			}

			if (iniciaMayuscula && !(contieneSimbolo)) {
				break;
			}

			System.out.println(
					"La clave debe empezar en mayuscula y contener al menos uno de los siguientes simbolos: "
							+ Arrays.toString(simbolos));
		} while (true);
		
		
		Usuario usuario = new Usuario();
	  
		usuario.setCorreo(correo);
		
		usuario.setClave(clave);
		System.out.println(usuario.getDatos());
		

		
		teclado.close();
	}

}
