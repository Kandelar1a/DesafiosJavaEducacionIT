package modulo21ej01;

public class ProductoPerecedero extends Producto{

	private int diasPorVencer;
	public static float descuento =  0.3f ;

	public ProductoPerecedero() {
		super();
	}

	public ProductoPerecedero(long id, String descripcion, Float precio, Integer cantidad, int diasPorVencer) {
		super(id, descripcion, precio, cantidad);
		this.diasPorVencer = diasPorVencer;
	}

	public int getDiasPorVencer() {
		return diasPorVencer;
	}

	public void setDiasPorVencer(int diasPorVencer) {
		this.diasPorVencer = diasPorVencer;
	}

	@Override
	public String toString() {
		return "Producto Perecedero [" + super.toString() + "]";
	}

	@Override
	public float getPrecioInventario() {
	
		
		if (diasPorVencer>10) {
			return super.getPrecio()*super.getCantidad();
		}
			return (super.getPrecio()-descuento*super.getPrecio())*super.getCantidad();
	}
	
	
		

}
