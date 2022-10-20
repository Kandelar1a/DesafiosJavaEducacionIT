package modulo07situacion03;

public class Valor {

	public String Nombre;
	public int N_Titulos;
	public double Precio_Cotizacion;
	
	public void verDatos() {
		System.out.println("Datos del valor: ");
		System.out.println("Nombre: " + Nombre);
		System.out.println("N° de Titulos: " + N_Titulos);
		System.out.println("Cotizacion: " + Precio_Cotizacion);
	}

}
