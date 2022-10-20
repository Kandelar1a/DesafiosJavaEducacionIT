package modulo21ej01;

public class ProductoNoPerecedero extends Producto {

	public ProductoNoPerecedero() {
		super();
	}

	public ProductoNoPerecedero(long id, String descripcion, float precio, Integer cantidad) {
		super(id, descripcion, precio, cantidad);
	}

	public String toString() {
		return "ProductoNoPerecedero [" + super.toString() + "]";
	}

	@Override
	public float getPrecioInventario() {
		
		return super.getPrecio()*super.getCantidad();
	}	

}
