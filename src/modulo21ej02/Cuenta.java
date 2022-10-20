package modulo21ej02;

public class Cuenta extends Producto {

	private TipoCuenta tipo;
	
	public Cuenta() throws TipoProductoExcepcion {
		setNumero(getNumeroGenerado());
	}

	public Cuenta(int banco, int sucursal, TipoCuenta tipo) throws TipoProductoExcepcion  {
		super(banco, sucursal);
		setTipo(tipo);
		setNumero(getNumeroGenerado());
	}

	@Override
	public String toString() {
		return "Cuenta [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "SUCURSAL") + ", Numero=" + Formato.getFormato(getNumero(), tipo.name())
				+ ", Tipo=" + tipo.getDescripcion() + "]";
	}

	public TipoCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoCuenta tipo) throws TipoProductoExcepcion {
		if (!tipo.isDisponible()) {
			throw new TipoProductoExcepcion(ErrorBanco.ERROR_PRODUCTO_NO_DISPONIBLE);
		}
		this.tipo = tipo;
	}
	
	
}
