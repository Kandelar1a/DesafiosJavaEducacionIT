package modulo03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String usuario, clave;
		String Pepito="Pepito";
		String a = "1234";
		
		
		System.out.print("Usuario: ");
		usuario = teclado.nextLine();
		System.out.print("Clave: ");
		clave = teclado.nextLine();
	
		if(usuario.equalsIgnoreCase(Pepito)&clave.equalsIgnoreCase(a))
			System.out.println("¡Bienvenido Pepito!");
		else
			if(usuario.equalsIgnoreCase(Pepito)&clave!=(a))
				System.out.println("Contraseña incorrecta");
			else
				if(usuario!=(Pepito)&clave.equalsIgnoreCase(a))
					System.out.println("Usuario incorrecto");
		
				teclado.close();
		
		
	}

}
