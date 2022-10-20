package modulo20ej01;

public class Usuario {

	private String correo;
	private String clave;
	
	public Usuario(String correo, String clave) {
		super();
		this.correo = correo;
		this.clave = clave;
	}

	public Usuario() {
	}

	public String getDatos() {
		return "Usuario [correo: " + correo + ", clave: " + clave + "]";
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
