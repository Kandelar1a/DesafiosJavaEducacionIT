package modulo21ej01;

public abstract class Producto implements AutoIncrementable {

	private long id;
	private String descripcion;
	private float precio;
	private Integer cantidad;

	
	public Producto() {
	}
	

	public Producto(long id, String descripcion, float precio, Integer cantidad) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	public abstract float getPrecioInventario();
	


}
