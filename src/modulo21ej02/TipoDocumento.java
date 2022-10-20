package modulo21ej02;

public enum TipoDocumento {
	DNI("Documento Nacional de Identidad"), PAS("Pasaporte"), LE("Libreta de Enrolamiento"), CI("Cedula de Identidad");

	private String descripcion;

	private TipoDocumento(String descripcion) {
		this.descripcion = descripcion.toUpperCase();
	}

	public String getDescripcion() {
		return descripcion;
	}



}
