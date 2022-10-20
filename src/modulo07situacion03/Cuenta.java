package modulo07situacion03;

import java.util.Date;

public class Cuenta {

	public String Tipo;
	public String N_Cuenta;
	public Date Apertura;
	public double Saldo;
	public double Interes;
	public int Meses;
	public Cliente Cliente;
	
	public void verDatos()
	{
		System.out.println("Datos de Cuenta: ");
		System.out.println("Tipo: " + Tipo);
		System.out.println("N° de Cuenta: " + N_Cuenta);
		System.out.println("Fecha de Apertura: " + Apertura);
		System.out.println("Saldo: " + Saldo);
		System.out.println("Interes: " + Interes);	
		System.out.println("Meses: " + Meses);
		System.out.println("Titular: " + Cliente.Nombre);	
	}

}
