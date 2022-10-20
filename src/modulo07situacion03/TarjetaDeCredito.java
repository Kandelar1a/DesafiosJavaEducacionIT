package modulo07situacion03;

import java.util.Date;

public class TarjetaDeCredito {

	public String Tipo;
	public String Numero;
	public Cliente Cliente;
	public Date Caducidad;
	
	public void verDatos() {
		System.out.println("Datos de la tarjeta de crédito: ");
		System.out.println("Vencimiento: " + Caducidad);
		System.out.println("Numero: " + Numero);
		System.out.println("Tipo: " + Tipo);
		System.out.println("Titular: " + Cliente.Nombre);
	}

}
