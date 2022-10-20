package modulo21ej02;

public class TarjetaDeCredito extends Producto {

	private int claveSeguridad;
	
	
	public TarjetaDeCredito() {
		setNumero(getNumeroGenerado());
	}

	public TarjetaDeCredito(int banco, int sucursal, int claveSeguridad)  {
		super(banco, sucursal);
		this.claveSeguridad = claveSeguridad;
		setNumero(getNumeroGenerado());
	}

	public String toString() {
		return "Cuenta [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "SUCURSAL") + ", Numero=" + Formato.getFormato(getNumero(), "TC")
				+ ", Clave=" +  Formato.getFormato(getClaveSeguridad(), "CS")  + "]";
	}


	public int getClaveSeguridad() {
		return claveSeguridad;
	}


	public void setClaveSeguridad(int claveSeguridad) {
		this.claveSeguridad = claveSeguridad;
	}
	
		
}
