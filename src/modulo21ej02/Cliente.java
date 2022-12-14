package modulo21ej02;

import java.time.LocalDate;
import java.util.List;

public class Cliente implements Fecha {

	private Documento documento;
	private String descripcion;
	private LocalDate fechaNacimiento;
	private List<Producto> productos;
	
	public Cliente() {
	}

	public Cliente(Documento documento, String descripcion, LocalDate fechaNacimiento, List<Producto> productos) {
		super();
		this.documento = documento;
		this.descripcion = descripcion;
		this.fechaNacimiento = fechaNacimiento;
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", descripcion=" + descripcion + ", fechaNacimiento="
				+ fechaNacimiento + ", productos=" + productos + "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}	
	
}
